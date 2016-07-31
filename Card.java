
public class Card {
	public String suit;
	public int value;
	public String name;
	public boolean used;

	public Card(int num){

		this.used=false;
		if(num%4==3){
			this.suit="Hearts";
		}else if(num%4==2){
			this.suit="Spades";
		}else if(num%4==1){
			this.suit="Diamonds";
		}else if(num%4==0){
			this.suit="Clubs";
		}
		if(num<4){
			this.value=2;
			this.name="two";
		}else if(num<8){
			this.value=3;
			this.name="three";
		}else if(num<12){
			this.value=4;
			this.name="four";
		}else if(num<16){
			this.value=5;
			this.name="five";
		}else if(num<20){
			this.value=6;
			this.name="six";
		}else if(num<24){
			this.value=7;
			this.name="seven";
		}else if(num<28){
			this.value=8;
			this.name="eight";
		}else if(num<32){
			this.value=9;
			this.name="nine";
		}else if(num<36){
			this.value=10;
			this.name="ten";
		}else if(num<40){
			this.value=10;
			this.name="Jack";
		}else if(num<44){
			this.value=10;
			this.name="Queen";
		}else if(num<48){
			this.value=10;
			this.name="King";
		}else if(num<52){
			this.value=1;
			this.name="Ace";
		}
	}
	public static Card CardVal(int value){
		Card place = new Card(value);
		return place;
	}
	public String toString(){
		String print = this.name+" of "+this.suit;
		return print;
	}
}