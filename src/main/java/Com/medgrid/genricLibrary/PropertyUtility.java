package Com.medgrid.genricLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyUtility {
	
	Properties ps;
	
//	public String getPropertyKeyValue(String Key) throws Throwable
//	{
//		FileInputStream fis = new FileInputStream(IPathConstants.PROPERTYFILEPATH);
//		ps = new Properties();
//		ps.load(fis);
//		return ps.getProperty(Key);	
//		
//	}	
	
	public PropertyUtility() 
	{
		File file = new File(IPathConstants.PROPERTYFILEPATH);
		
		try {
		FileInputStream fist = new FileInputStream(file);
		ps=new Properties();
		ps.load(fist);
	
	}
		catch(Exception e)
		{
			System.out.println("Exception is" +e.getMessage());
		}	
	}
	
	public String getApplicationURL()
	{
		String URL = ps.getProperty("url");
		return URL;
	}
	
	public String getUserName()
	{
		String USERNAME = ps.getProperty("username");
		return USERNAME;
	}
	
	public String getPassWord()
	{
		String PASSWORD = ps.getProperty("password");
		return PASSWORD;
	}
	
	public String getBrowser()
	{
		String BROWSER = ps.getProperty("browser");
		return BROWSER;
	}

}
