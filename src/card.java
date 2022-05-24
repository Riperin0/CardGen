
public class card {
	
	
	suit suit; 
	value value;
	
	
	
	//Constructors
	public card() //empty constructor
	{
		// TODO Auto-generated constructor stub
	}
	
	public card(suit spade,value ace) //
	{ 
		suit = spade;
		value = ace;
		
	}
	
	
	
	
	
	
	//Getters
	public suit getSuit() 
	{
		return suit;
	}
	
	public value getValue() 
	{
		return value;
	}
	
	public int getSuitInt() {

		return suit.ordinal();
	}
	
	public int getValueInt() {
		return value.ordinal()+1;
	}
	
	
	
	
	
	
	//Setters
	public void setSuit(suit s) 
	{
		suit = s;
	}
	
	public void setValue(value v) 
	{
		value = v;
	}
	
	
	@Override
	public String toString() {
		
		;
		
		String s = String.format("%s of ", value)+suit;
		
		
		// TODO Auto-generated method stub
		return s;
	}
	
	public boolean equals(card c) {
		if(c.suit==suit && c.value == value) {
			return true;
		}
		
		return false;

	}
	
	

}
