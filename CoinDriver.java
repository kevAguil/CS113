
public class CoinDriver {

	public static void main(String[] args) {
		MonetaryCoin[] coins = new MonetaryCoin[20];
		for(int i=0;i<20;i++)
			coins[i]= new MonetaryCoin((int)(Math.random()*99+1));
		int index=0;
		for (int i=0;i<20;i++) 
			if(!(coins[i].isHeads()) && coins[i].getValue() > coins[index].getValue())
				index = i;
		System.out.println("Largest Tails: "+ coins[index]);


	}

}
