package readingFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingInFile {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		File f = new File("E:\\Ambuj.txt");
		FileWriter fw = new FileWriter(f,true);
		BufferedWriter writer = new BufferedWriter(fw);
		
		writer.write("Ambuj");
		writer.append("Goyal");
		writer.close();

	}

}
