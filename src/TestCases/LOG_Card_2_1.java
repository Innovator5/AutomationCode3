/**
 * 
 */
package TestCases;


/**
 * @author Dhruv
 * Apr 28, 2016
 */
public class LOG_Card_2_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		 String [] card = {"sk","c4","ck","hq","h5"};
		 char[] b = new char[5];
		 char[] b1 = new char[5];
		 int count = 0;
		 for (int i = 0; i<= card.length-1;i++)
		 {
		   	 b[i] = card[i].charAt(0);
		   	 b1[i]= card[i].charAt(1);
		 }
		 /*
		 for(int x = 0;x<=b.length-1;x++){
			 System.out.println("B: "+b[x]);
			 
		 }*/
		 for(int y = 0;y<=b1.length-1;y++)
		 {
			 System.out.println ("B1: "+ b1[y]);
		     char[] cards = {1,2,3,4,5,6,7,8,9,10,'j','q','k'};
			 
			 for (int i = 0; i<cards.length/2;i++)
			 {
				 char u = '2';
				   if (cards[i] == u)
				   {
					 System.out.println("Counter: " + count++);  
					}
			 }
			   for (int a = cards.length/2; a>=0;a--)
			   {
				   char u = '2';
				   if (cards[a] == u)
				   {
					 System.out.println("Counter: " + count++);  
					}	  	 
				 } 
		 }
       
		//============================Algo================
	}

	
	public int Count(char u){
		int count = 0; 
		char[] cards = {1,2,3,4,5,6,7,8,9,10,'j','q','k'};
		for (int i = 0; i<cards.length/2;i++)
		 {
			  u = 2;
			   if (cards[i] == u)
			   {
				 System.out.println("Counter: " + count++);  
				}
		 }
		 
	   return count;	
	} 
}
