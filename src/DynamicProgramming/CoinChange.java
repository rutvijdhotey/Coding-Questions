package DynamicProgramming;

import java.util.HashMap;

public class CoinChange {
	public static long findWaysForAmount(int amount, int[] coins) {
		return findWaysForAmount(amount, coins, 0, new HashMap<String, Long>());
	}

	private static long findWaysForAmount(int amount, int[] coins, int i, HashMap<String, Long> hashMap) {
		if (amount == 0) {
			return 1;
		}
		if (i >= coins.length) {
			return 0;
		}
		int amountWithCoin = 0;
		String key = amount + "-" + i;

		// HashMap for memoization
		if (hashMap.containsKey(key)) {
			return hashMap.get(key);
		}
		long ways = 0;

		while (amount >= amountWithCoin) {
			int amountRemaining = amount - amountWithCoin;
			ways += findWaysForAmount(amountRemaining, coins, i + 1, hashMap);
			amountWithCoin += coins[i];
		}
		hashMap.put(key, ways);

		return ways;
	}
}
