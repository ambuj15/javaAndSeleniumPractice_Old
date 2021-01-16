package readingFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadNameFile 
{

	public static void main(String[] args) throws IOException 
	{
	Properties prop = new Properties();
	FileInputStream fs = new FileInputStream("C:\\JavaProgramming\\JavaPractice\\November_Practice\\src\\readingFile\\names.properties");
	prop.load(fs);
	String a = prop.getProperty("name");
	String b = prop.getProperty("company");
	
	System.out.println(a + " "+b);

	}

}
