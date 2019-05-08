import java.util.*;

public class blackjack {
	
	static ArrayList<Integer>userHand = new ArrayList<Integer>();
	static ArrayList<Integer>dealerHand = new ArrayList<Integer>();

	public static void main(String[] args) {
	
		int userCard1 = dealCards();
		int userCard2 = dealCards();
		int dealerCard1 = dealCards();
        int dealerCard2 = dealCards();
        int userArraySum;
        int dealerArraySum = dealerHand(dealerCard1, dealerCard2);
        
        
		dealerCards(dealerCard1, dealerCard2);
		playersCards(userCard1, userCard2);

		int thirdCard = addCard(drawCard());
		userArraySum = playerHand(userCard1, userCard2, thirdCard);
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

        System.out.println("dealers shows " + dealerCard1);
        System.out.println("dealer hides " + dealerCard2);
        //System.out.println("dealers total is " + dealerCard1 +  dealerCard2);

   
    }//end of dealer hand
    
    public static int dealerHand(int dealerCard1, int dealerCard2) {
        dealerHand.add(dealerCard1);
        dealerHand.add(dealerCard2);
        int dealerArraySum = 0;
        for (int i : dealerHand)
        {
        	dealerArraySum += i;
        }
        return dealerArraySum;   
       
    }//end of dealerHand
	public static void playersCards(int userCard1, int userCard2) {

        System.out.println("user got " + userCard1 + " and a " + userCard2);

	}//end of players cards
	
	public static int playerHand(int userCard1, int userCard2, int thirdCard) {		
        userHand.add(userCard1);
        userHand.add(userCard2);
        userHand.add(thirdCard);
        
        
        int userArraySum = 0;
        for (int i : userHand)
        {
        	userArraySum += i;
        	//System.out.println(userArraySum);
        }
        //System.out.println(userArraySum);
        return userArraySum;   
	}//end of player hand

	public static String drawCard() {
	  Scanner myObj = new Scanner(System.in);  // Create a Scanner object
      System.out.println("Would you like to draw a card? yes or no");

      String drawCard = myObj.nextLine();  // Read user input

      String userAnswer = drawCard;
      return userAnswer; 
	 
	}//end of drawCard()
	
	public static int addCard(String userAnswer) {
		if(userAnswer.equalsIgnoreCase("yes")) { 
			int newCard3 = getOneCard();
			System.out.println("Your Third Card is " + newCard3);
			return newCard3;
		}
		else {
			System.out.println("no card for you!");
			return 0;
		}
	}//end of  adddCard
	
	public static int getOneCard() {
		Random rand = new Random();
        int newCard3 = rand.nextInt(10) +1;
        return newCard3; 
	}

	public static void playGame(int dealerSum, int sum) {
		
		if(dealerSum < sum && dealerSum <= 21 && sum <= 21) {
			System.out.println("YOU WIN!!");
		}
	
		if(dealerSum > sum && dealerSum <= 21 || sum >= 22) {
			System.out.println("YOU LOSE!!");
		}
		if(dealerSum == sum) {
			System.out.println("YOU PUSH!!");
		}
	}//end of Play Game


}//end of public class blackjack 
