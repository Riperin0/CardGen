

public class Main {
	
	
	
	
	
	
	
	static String[][] lowArray = {
            {	"1 of stars - Transmuter", "2 of stars - Diviner","3 of stars - Enchanter","4 of stars- Abjurer","5 of stars - Elementalist",
            	"6 of stars - Evoker", "7 of stars - Illusionist", "8 of stars - Necromancer", "9 of stars - Conjurer", "Master of stars - Wizard"}, 
            {	"1 of coins - Swashbuckler", "2 of coins - Philanthropist","3 of coins - Trader","4 of coins - Merchant","5 of coins - Guild Member",
            	"6 of coins - Beggar", "7 of coins - Thief", "8 of coins - Tax Collector","9 of coins - Miser","Master of coins - Rogue"						},
            {	"1 of Glyphs - Monk","2 of Glyphs - Missionary","3 of glyphs - Healer", "4 of glyphs - Shephard", "5 of glyphs - Druid",
            	"6 of glyphs - Anarchist", "7 of glyphs - Charlatan", "8 of glyphs - Bishop", "9 of glyphs - Traitor", "master of glpyhs - Priest"					},
            {	"1 of swords - Avenger","2 of swords - Paladin","3 of swords - Soldier","4 of swords - Mercenary","5 of swords - Myrmidon",
            	"6 of swords - Beserker","7 of swords - Hooded One","8 of swords - Dictator","9 of swords - Torturer","master of swords - Warrior"					}
          };
	
	
	static String[][] highArray = {
			
			{"Seer","Raven","Donjon"},
			{"Beast","Tempter", "Broken One"},
			{"Marionnete","Innocent","Ghost"},
			{"Executioner","Mists","Darklord"},
			{"Artifact","Horseman"}
			
			
			
			
	};
	
	
	
	
	
	public static String lowToLocation(card c) {
		
		return(lowArray[c.getSuitInt()][c.getValueInt()-1]);

	}
	
	public static String highToAlly(card c) {
		
		if(c.getSuitInt()<4) {
			return(highArray[c.getSuitInt()][c.getValueInt()-11]);
			
		}
		
		if(c.getSuitInt()==4) {
			return(highArray[c.getSuitInt()][c.getValueInt()-14]);
			
		}
		
		
		
		return null;
	}
	
	public String highToStrahd(card c) {
		
		
		return null;
	}
	
	
	

	public static void main(String[] args) {
		
		//card s = new card(suit.SPADE,value.ACE);
		
		
		//System.out.println(s);
		
		randomCard r = new randomCard();
		
		System.out.println("LowDeck");
		
		
		card prev = new card();
		
		
		for (int i=0;i<4;i++) {
			card curr = r.nextLowCard();
			
			while(prev ==curr) {
				curr = r.nextLowCard();
			}
			
			
			
			
			System.out.println("\t"+lowToLocation(curr));
			
			prev = curr;
			
		
		}
		
		System.out.println("HighDeck");
		
		for (int i=0;i<2;i++) {
			
			card curr = r.nextHighCard();
			
			while(prev ==curr) {
				curr = r.nextHighCard();
			}
			
			
			
			
			System.out.println("\t"+highToAlly(curr));
			
			prev = curr;
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

	

}
