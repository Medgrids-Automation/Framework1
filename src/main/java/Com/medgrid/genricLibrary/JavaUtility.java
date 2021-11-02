package Com.medgrid.genricLibrary;

import java.util.Date;
import java.util.Random;

public class JavaUtility {
	
	public static String getRandomData()
	{
		Random rn = new Random();
		int rnumber = rn.nextInt(1000);
		return "_"+rnumber;
	}
	 
	public String getCurrrentSystemDate()
	{
		Date date= new Date();
		String currentDate = date.toString();
		return currentDate;
		
	}

}
