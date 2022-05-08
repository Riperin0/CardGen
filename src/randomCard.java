
import java.util.Random;



public class randomCard {

	Random rand = new Random();

	
	
	//Low deck
	//4 suits
	//Aces-10
	
	//High deck
	//4 suits+jokers
	//Jacks-Kings
	
	
	
	public card nextCard() {

		suit s = randomSuit();
		
		value v = randomVal(s);
		
		card c = new card(s,v);
		
		return c;
		
		
		
		
	}
	
	
	public card nextLowCard() {


		suit s = randomLowsuit();
		
		value v = randomLowVal();
		
		card c = new card(s,v);
		
		return c;
		
	}
	
	public card nextHighCard() {
		

		suit s = randomSuit();
		
		value v = randomFaceVal(s);
		
		card c = new card(s,v);
		
		return c;
		
	}
	
	
	
	
	
	
	
	
	private suit intToFace(int i) 
	{
		switch(i) {
		case(1):
			return suit.CLUBS;
		case(2):
			return suit.DIAMOND;
		case(3):
			return suit.HEART;
		case(4):
			return suit.SPADE;
		case(5):
			return suit.JOKER;
		}
			
			return null;
	}
	
	private value intToVal(int i) 
	{
		switch(i) {
			case(1):
				return value.ACE;
			case(2):
				return value.TWO;
			case(3):
				return value.THREE;
			case(4):
				return value.FOUR;
			case(5):
				return value.FIVE;
			case(6):
				return value.SIX;
			case(7):
				return value.SEVEN;
			case(8):
				return value.EIGHT;
			case(9):
				return value.NINE;
			case(10):
				return value.TEN;
			case(11):
				return value.JACK;
			case(12):
				return value.QUEEN;
			case(13):
				return value.KING;
			case(14):
				return value.JOKER1;
			case(15):
				return value.JOKER2;
		
		}
		return null;
	}
	

	
	private suit randomSuit() {
		
		int s = rand.nextInt(5)+1;
		
		return intToFace(s);
		
		
		
	}
	
	private value randomVal(suit s) {
		int val;
		if(s==suit.JOKER) 
		{
			val = rand.nextInt(2)+14;

		} 
		else 
		{
			val = rand.nextInt(13)+1;
		}
		
		return intToVal(val);

		
	}
	
	private suit randomLowsuit() {
		
		int s = rand.nextInt(4)+1;
		
		return intToFace(s);
		
	}

	private value randomLowVal() {
		int val;

			val = rand.nextInt(10)+1;
		
		return intToVal(val);
	}
	
	private value randomFaceVal(suit s) {
		int val;
		if(s==suit.JOKER) 
		{
			val = rand.nextInt(2)+14;

		} 
		else 
		{
			val = rand.nextInt(3)+11;
		}
		
		return intToVal(val);
	}
	
	
	
}




