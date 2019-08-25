

import java.util.Set;
import java.util.TreeSet;

public class Encoding 
{
	 public static Set<String> morseCodes(int m, int n)
	   {
		 
	      Set<String> result = new TreeSet<>();
	      recHelper("",m , n , result);
	      return result;
	   }
	 public static void recHelper(String s, int m, int n, Set<String> result)
	 {
		 if(m>0)
		 {
			 recHelper(s+".",m-1,n,result);
		 }
		 if(n>0)
		 {
			 recHelper(s+"-",m,n-1,result);
		 }
		 if(m==0&&n==0)
		 {
			 result.add(s);
		 }
	 }
}
