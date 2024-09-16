import java.util.ArrayList;
import java.util.Collections;

public class Reverse_A_Word_String
{
	public static String reverseString(String str) 
	{
		//Write your code here
		ArrayList<String>ts=new ArrayList<>();
		String []st=str.split(" ");
		for(String i:st){
			ts.add(i);
		}
		Collections.reverse(ts);
		String s="";
		for(String i:ts){
			s+=i;
			s+=" ";
		}
		return s;

	}
}

