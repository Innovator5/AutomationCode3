/**
 * 
 */
package TestCases;

/**
 * @author Dhruv
 * Apr 28, 2016
 */
public class LOG_Card_2 {

	/**
	 * @param args
	 */
public static void main(String [] args){
		String [] arr = {"sk","c4","c ck","h hq","h h5"};
		String [] newarr = new String[5];   
    	for (int i = 0; i<= arr.length-1;i++)
    	{
		  if (arr[i].length()== 2)
		  {
			  newarr[i] = arr[i];
		  }
		  else if (arr[i].length()== 4)
		  {

	      	   String c = arr[i];
	      	   String[] j = c.split(" ");
	      	   for (int y =1;y<3;y+=2)
	      	   {
	      		newarr[i]  = j[y];
	      	   }	  
		  }
		  System.out.println(newarr[i]);
	  }
   }
}
