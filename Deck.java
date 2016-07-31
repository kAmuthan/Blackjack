
public class Deck {
	public static Card[] deck = new Card[52];

	public static void main(String[] args){
		for(int i=0;i<deck.length;i++){
			deck[i]= new Card(i);
		}
		for(int i=0;i<deck.length;i++){
			System.out.println(deck[i].toString());
		}
		System.out.println("");
		final Card[] tempDeck = deck;

	}
	public static Card giveCard(){
		Card randCard = new Card(0);
		randCard = deck[(int)(Math.random()*51)+1];
		return randCard;
	}
	/*public int giveCard(){
		int card=0;
		card = deck[(int)((Math.random()*51)+1)];
		return card;
	}*/
	private static boolean checkArray(int a, int[] array){
		boolean inside = false;
		for(int i=0;i<array.length;i++){
			if(array[i]==a){
				inside=true;
				break;
			}
		}
		return inside;
	}
}
