
public class MonetaryCoin extends Coin{
	private int cents;
	
	public MonetaryCoin(int cents) {
		this.cents=cents;		
	}
	
	public void setValue(int cents) {
		this.cents=cents;
	}
	
	public int getValue() {
		return cents;
	}
	
	public String toString() {
		if(super.isHeads())
			return "This coin is worth "+cents+" cents and is on Heads";
		else
			return "This coin is worth "+cents+" cents and is on Tails";
	}

}
