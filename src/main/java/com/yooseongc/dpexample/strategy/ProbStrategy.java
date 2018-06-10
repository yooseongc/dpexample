package com.yooseongc.dpexample.strategy;

import java.util.Random;

public class ProbStrategy implements Strategy {

	private Random random;
	private RockPaperScissors prevHandValue = RockPaperScissors.NONE;
	private RockPaperScissors currHandValue = RockPaperScissors.NONE;
	private int[][] hist = {
			{ 1, 1, 1 },
			{ 1, 1, 1 },
			{ 1, 1, 1 }
	};
	
	public ProbStrategy(int seed) {
		random = new Random(seed);
	}
	
	@Override
	public Hand nextHand() {
		int bet;
		RockPaperScissors handValue = RockPaperScissors.NONE;
		if (currHandValue == RockPaperScissors.NONE) {
			bet = random.nextInt(3);
			handValue = RockPaperScissors.values()[bet];
		} else {
			bet = random.nextInt(getSum(currHandValue));
			if (bet < hist[currHandValue.getCode()][0]) 
				handValue = RockPaperScissors.values()[0];
			else if (bet < hist[currHandValue.getCode()][0] + hist[currHandValue.getCode()][1])
				handValue = RockPaperScissors.values()[1];
			else handValue = RockPaperScissors.values()[2];
		}
		
		prevHandValue = currHandValue;
		currHandValue = handValue;
		return Hand.getHand(handValue);
	}

	@Override
	public void study(GameResult result) {
		if (prevHandValue == RockPaperScissors.NONE) return;
		if (result == GameResult.WIN) {
			hist[prevHandValue.getCode()][currHandValue.getCode()]++;
		} else {
//			hist[prevHandValue.getCode()][(currHandValue.getCode() + 1) % 3]++;
//			hist[prevHandValue.getCode()][(currHandValue.getCode() + 2) % 3]++;
		}
	}
	
	private int getSum(RockPaperScissors handValue) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += hist[handValue.getCode()][i];
		}
		return sum;
	}

}
