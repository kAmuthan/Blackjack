import java.util.*;
public class MainGame {

	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		String userInput = "";
		boolean correct = false;
		System.out.println("Welcome to Kiran's Blackjack game!");
		System.out.println("Would you like to begin? (yes or no)");
		while(correct==false){
			userInput=console.nextLine();
			if(userInput.equals("yes")){
				correct = true;
				blackjackGame();
			}else if (userInput.equals("no")){
				System.out.println("See ya!");
				System.exit(0);
			}else{
				System.out.println("That isn't valid. Try again!");
			}
		}
	}
	public static void blackjackGame(){
		boolean win = false;
		System.out.println("Match 1: Begin!");
		BlackjackPlayer user = new BlackjackPlayer(1);
		BlackjackPlayer dealer = new BlackjackPlayer(0);
		while(win==false){
			System.out.println("Your hand:");
			user.readHand();
			System.out.println("The dealer's hand:");
			
		}

	}
}
