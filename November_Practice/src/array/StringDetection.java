package array;

//This code will find out number of times a particular word is occuring in a sentence.

public class StringDetection {

	public static void main(String[] args) 
	
	{
		int count=0;
		String s = "I love my India.India is my country,jai Hind.India.IndiA.InDiA., india";
		String s1 = "India";
		
		String cut[] = s.split("[ .,]");
		
		//String s1 = cut[j];
		for(int i=0;i<cut.length;i++)
		{
			if(cut[i].equalsIgnoreCase(s1))
			
			{
			 count++;
			}
		System.out.println(cut[i]);
		}
		System.out.println();
		System.out.println("Occurence of string "+s1+" = " + count);
		
	
	
	//2nd way without using loops
		
		//String s = "Iamambujiamfromindiai,ilovemyindia";
		
		//String word = "india";
		
		//String n = s.replace(word, "");
		
		//int count = (s.length()-n.length())/word.length();
		//System.out.println(count);
		
	}
	

}
