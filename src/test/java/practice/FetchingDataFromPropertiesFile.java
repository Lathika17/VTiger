package practice;  //03.09.26

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;

public class FetchingDataFromPropertiesFile {
	public static void main(String[] args) throws IOException {
//		FileInputStream fis = new FileInputStream
//				("C:\\Users\\ADMIN\\OneDrive\\Desktop\\commontcdata.properties"); //create a connection to external file
//		Properties prop = new Properties();  //create a empty object
//		prop.load(fis);       // load data from file to object
//		String URL = prop.getProperty("url");  //fetch the data from object
//		System.out.println(URL);
		
		PropertiesUtility pu = new PropertiesUtility ();
		String URL = pu.getDataFromProperties("url");
		System.out.println(URL);
		String username = pu.getDataFromProperties("un");
		System.out.println(username);
		String password = pu.getDataFromProperties("pwd");
		System.out.println(password);
		
		
	}

}
