import java.util.*;

public class blackjack {
	
   

	public static void main(String[] args) {
	
		int userCard1 = dealCards();
		int userCard2 = dealCards();
		int dealerCard1 = dealCards();
        int dealerCard2 = dealCards();
        
		dealerCards(dealerCard1, dealerCard2);
		playersCards(userCard1, userCard2);
		//int userCard3 = getOneCard();
		int thirdCard = addCard(drawCard());
		int newtotal = userCard1 + userCard2;
		int sum = newtotal + thirdCard;
		int dealerSum = dealerCard1 + dealerCard2;
		System.out.println("Player: " + sum + " vs. Dealer: " + dealerSum);
		playGame(dealerSum, sum);
	
	}//end of public static void main

	public static int dealCards() {
		Random rand = new Random();
        int newCard = rand.nextInt(10) +1;
        return newCard; 
	}//end of int dealCards()
        
    public static void dealerCards(int dealerCard1, int dealerCard2) {
//        int dealerCard1 = dealCards();
//        int dealerCard2 = dealCards();
        System.out.println("dealers shows " + dealerCard1);
        System.out.println("dealer hides " + dealerCard2);
        //System.out.println("dealers total is " + dealerCard1 +  dealerCard2);
//        int dealerSum = dealerCard1 + dealerCard2;  
//        return dealerSum;
   
    }//end of dealer hand
       
	
	public static void playersCards(int userCard1, int userCard2) {
//		int userCard1 = dealCards();
//        int userCard2 = dealCards();
        //int playerCards[] = {}; 
        System.out.println("user got " + userCard1 + " and a " + userCard2);
//        int sum = userCard1 + userCard2;
//        return  sum;
        
	}//end of players cards

	public static String drawCard() {
	  Scanner myObj = new Scanner(System.in);  // Create a Scanner object
      System.out.println("Would you like to draw a card? yes or no");

      String drawCard = myObj.nextLine();  // Read user input
      //System.out.println("You are getting a card");// Output user input
      String userAnswer = drawCard;
      return userAnswer; 
	 
	}//end of drawCard()
	
	public static int addCard(String userAnswer) {
		if(userAnswer.equalsIgnoreCase("yes")) { 
			int userCard3 = getOneCard();
			System.out.println("Your Third Card is " + userCard3);
			return userCard3;
		}
		else {
			System.out.println("no card for you!");
			return 0;
		}
	}//end of  adddCard
	
	public static int getOneCard() {
		Random rand = new Random();
        int userCard3 = rand.nextInt(10) +1;
        return userCard3; 
	}
//	System.out.println(playersCards(); + userCard3);
	public static void playGame(int dealerSum, int sum) {
		
		if(dealerSum < sum && dealerSum <= 21 && sum < 21) {
			System.out.println("YOU WIN!!");
		}
//		if(dealerSum < 17 && sum < 21) {
//			getOneCard();
//		}		
		if(dealerSum > sum && dealerSum <= 21 || sum >= 22) {
			System.out.println("YOU LOSE!!");
		}
		if(dealerSum == sum) {
			System.out.println("YOU PUSH!!");
		}
	}//end of Play Game


}//end of public class blackjack 
