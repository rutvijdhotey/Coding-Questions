package DynamicProgramming;

public class mainClass {
	public static void main(String[] args) {
		int amount = 3;
		int[] coins = {1,2};
		
		long ways = CoinChange.findWaysForAmount(amount, coins);
		
		System.out.println(ways + " Are the number of ways we can get change for the amount");
	}
}
