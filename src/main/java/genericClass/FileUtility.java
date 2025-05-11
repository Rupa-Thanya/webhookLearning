package genericClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility implements FrameWorkConstraints{
	public static String getProperty(String key) {
		//Step 1: •	Get the java representation Object of the Physical file using “FileInputSteam
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(PROPERTYFILE);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		//Step 2: • Create a Object of “Properties” class & load all the keys
		Properties p=new Properties();
		try {
			p.load(fis);
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Step 3: Read the data using getProperty(“Key”)
		return p.getProperty(key);
	}
	
}


