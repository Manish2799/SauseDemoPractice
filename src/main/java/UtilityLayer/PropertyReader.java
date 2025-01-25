package UtilityLayer;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import BaseLayer.BaseClass;

public class PropertyReader extends BaseClass {

	public static String  getProperty(String keyname) {
		Properties prop = new Properties();

		String path = System.getProperty("user.dir") + "/src/main/java/ConfigurationLayer/config.properties";

		try {

			FileInputStream fis = new FileInputStream(path);
			
			prop.load(fis);

			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return prop.getProperty(keyname);
	}
}
