/**
 * 
 */
package TestCases;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Dhruv
 * Apr 27, 2016
 */
public class example {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
	  
		Map<String,Integer> h = count();
		System.out.println(h.keySet());
		System.out.println(h.values());
		Collection<Integer> cardcount = h.values();
		Collection<String> card = h.keySet();
	    System.out.println("card iterator: "+card.iterator().next());
	    ArrayList<Integer> g = (ArrayList<Integer>) h.values();  
	    System.out.println(g);
	 } 
	
  
   public static Map<String,Integer> count()
   {
		String[] a = {"q","k","q","q"};
		int len = a.length;
		Map<String, Integer> numChars = new HashMap<String, Integer>(Math.min(len, 26));
        for (int i = 0; i < len; ++i)
		{
		  String charAt = a[i];
          if (!numChars.containsKey(charAt))
		    {
		        numChars.put(charAt, 1);
		    }
		    else
		    {
		        numChars.put(charAt, numChars.get(charAt) + 1);
		    }
		 }
	   return numChars;
	 }
}

