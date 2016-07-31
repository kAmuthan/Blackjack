import java.util.ArrayList;
import java.util.Scanner;

public class BlackjackPlayer {
	public ArrayList<Card> cards = new ArrayList<Card>();
	private int tokens;
	private String name;
	public BlackjackPlayer(int dealer){
		Scanner console=new Scanner(System.in);
		this.cards.add(Deck.giveCard());
		this.cards.add(Deck.giveCard());
		tokens=0;
		if(dealer!=0){
			System.out.println("Put your name here:");
			name=console.nextLine();
		}else{
			name="dealer";
		}
		console.close();
	}
	public void startCards(){
		this.cards.clear();
		this.cards.add(Deck.giveCard());
		this.cards.add(Deck.giveCard());
	}
	public void addCard(Card card){
		cards.add(card);
	}
	public void readHand(){
		for(int i=0;i<cards.size();i++){
			Card temp =cards.get(i);
			System.out.println(temp.toString());
		}
	}
	public void dealerHand(){
		System.out.println("[hidden]");
		for(int i=1;i<cards.size();i++){
			System.out.println(cards.get(i).toString());
		}

	}
}
