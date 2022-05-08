

public class Main {
	

	public static void main(String[] args) {
		
		//card s = new card(suit.SPADE,value.ACE);
		
		
		//System.out.println(s);
		
		randomCard r = new randomCard();
		
		System.out.println("LowDeck");
		
		
		card prev = new card();
		
		
		for (int i=0;i<3;i++) {
			card curr = r.nextLowCard();
			
			while(prev ==curr) {
				curr = r.nextLowCard();
			}
			
			
			
			
			System.out.println("\t"+curr);
			
			prev = curr;
			
		
		}
		
		System.out.println("HighDeck");
		
		for (int i=0;i<2;i++) {
			
			card curr = r.nextHighCard();
			
			while(prev ==curr) {
				curr = r.nextHighCard();
			}
			
			
			
			
			System.out.println("\t"+curr);
			
			prev = curr;
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
