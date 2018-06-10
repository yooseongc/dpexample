package com.yooseongc.dpexample.strategy;

public class Hand {
	
	private RockPaperScissors handValue;
	private Hand(RockPaperScissors handValue) {
		this.handValue = handValue;
	}
	
	public static Hand getHand(RockPaperScissors handValue) {
		return new Hand(handValue);
	}
	
	public RockPaperScissors getValue() {
		return handValue;
	}
	
	@Override
	public String toString() {
		return this.handValue.getDesc();
	}
	
}
