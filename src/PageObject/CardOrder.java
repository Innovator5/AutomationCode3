package PageObject;

public class CardOrder {

	public static void main(String[] args) {

		String[] CardType = new String[4];
		String[] CardValue = new String[13];
		String[] CardSequence = {"s1","d5","h6","hq","dq"};
		
			
		
		for (int i =0; i< CardSequence.length-1;i++)
		{
		 String temp = CardSequence[i];
		 String[] temp1 = temp.split("?<=\\D)(?=\\d)");
		  	
		 System.out.println("Card Type: "+temp1[0]);
		 System.out.println("CardValue: "+temp1[1]);
		}
	}

}
