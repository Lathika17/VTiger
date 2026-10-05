package practice;      //04.09.26

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritingDataToPropertiesFile {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream
				("C:\\Users\\ADMIN\\OneDrive\\Desktop\\commontcdata.properties");//Create a connection to external file
		Properties prop = new Properties(); //create an empty object
		prop.load(fis); //load the data to the object
		prop.setProperty("email", "lathu17@gmail.com");
		System.out.println(prop);
		FileOutputStream fos = new FileOutputStream
				("C:\\Users\\ADMIN\\OneDrive\\Desktop\\commontcdata.properties");  //write data to the object
		prop.store(fos, "Email is updated");  //Flushing operation
		
	}

}
