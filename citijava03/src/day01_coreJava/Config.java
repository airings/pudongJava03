package day01_coreJava;
import java.io.IOException;
import java.util.Properties;


public class Config {
	private static Config instance = null;
	private String username;
	private String pwd;
	
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	private Config(){
		Properties pro = new Properties();
		try {
			pro.load(Config.class.getResourceAsStream("config.properties"));
			username = pro.getProperty("username");
			pwd = pro.getProperty("pwd");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static Config getInstance(){
		if (instance == null)
			instance = new Config();
		return instance;
	}
}
