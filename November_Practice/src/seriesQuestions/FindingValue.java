package seriesQuestions;

public class FindingValue 
{

	public static void main(String[] args) 
	{
		int Count = 0;
		String s = "I am Ambuj Goyal,I live in Pune.I am working in infosys as a test engineer.I love my India i";
		
		//To count number of I's both upper and lower case by using regex. 
		//String[] split = s.split("[ ,.a-hj-zA-HJ-Z]*");
		String[] split = s.split("[Ii]*");
		for(int i =0;i<split.length;i++)
		{
			System.out.println(split[i]);
			if(split[i].toLowerCase().equals("i"))
			{
				Count++;
			}
		}
		System.out.println(Count);

	}

}
