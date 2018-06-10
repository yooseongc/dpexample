package com.yooseongc.dpexample.strategy;

import java.util.Random;

public class WinningStrategy implements Strategy {

	private Random random;
	private GameResult result;
	private Hand prevHand;
	
	public WinningStrategy(int seed) {
		random = new Random(seed);
	}
	
	@Override
	public Hand nextHand() {
		if (result != GameResult.WIN)
			prevHand = Hand.getHand(RockPaperScissors.values()[random.nextInt(3)]);
		return prevHand;
	}

	@Override
	public void study(GameResult result) {
		this.result = result;
	}

}
