package array;

public class StringPallindrome {
	//This is the program for identifying a pallindrome string without using another array.

	public static void main(String[] args) 
	{
		String s = "JA";
		char a[]=s.toCharArray(); //Converting string to char array.
		int size = a.length;      //Finding out size of char array.
		int flag=0, ref =0;       //Setting up to flag variables.
		for(int i =0;i<size;i++)
		{
			flag=0;ref =0;       //Initializing both flag variables to zero.
			if(a[i]==a[(size)-1]) //Identifying whether first character is same as last character
			{
				flag =1;          //If condition satisfies change flag variable to 1.
			
			}
			else if(flag==0)     //When above if condition fails then flag variable's value doesn't change and we are putting this check because in case of odd number of characters like AMBUJ, flag will have value = 1 when it will come to U and hence the output can come Palindrome just because of this U.
			{
				ref =1;          //To avoid this issue we have taken ref variable which says if at any time here in case of U flag ==0 make ref = 1.
				break;
			}
			size--;
			
		}
		if(flag==1 && ref==0)
		{
			System.out.println("String is palindrome;");
		}
		else
			System.out.println("String is non palindrome");
}

}
