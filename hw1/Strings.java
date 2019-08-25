
public class Strings
{
	public static String uniqueLetters(String str)
	   {
		String answer="";
		
		for(int i=0;i<str.length(); i++)
		{
			int numOfLet=0;
			for(int j=0;j<str.length(); j++)
			{
				if(str.charAt(i) == str.charAt(j))
					numOfLet++;
				
				}
			if(numOfLet==1)
			{
			answer += str.charAt(i);		
			}
			
			
		}
	     return answer;
	   }

}
