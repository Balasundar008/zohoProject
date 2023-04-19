package property;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public Properties p;
	public ConfigurationReader() throws IOException {
		File f= new File("C:\\Users\\Admin\\eclipse-workspace1\\ZohoProject\\src\\main\\java\\property\\Zoho.properties");
		FileInputStream fis= new FileInputStream(f);
		
//		Properties p= new Properties();
		p= new Properties();
		
		p.load(fis);
		
	}
	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}
	public String getUrl() {
		String url = p.getProperty("url");
		return url;

	}
	public String getEmail() {
		String email = p.getProperty("email");
		return email;
	}
	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}
	

}
