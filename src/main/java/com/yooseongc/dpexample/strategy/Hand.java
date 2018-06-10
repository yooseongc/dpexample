package com.yooseongc.dpexample.strategy;

public class Hand {
	
	private RockPaperScissors handValue;
	private Hand(RockPaperScissors handValue) {
		this.handValue = handValue;
	}
	private static Hand ROCK = new Hand(RockPaperScissors.ROCK);
	private static Hand SCISSORS = new Hand(RockPaperScissors.SCISSORS);
	private static Hand PAPER = new Hand(RockPaperScissors.PAPER);
	
	public static Hand getHand(RockPaperScissors handValue) {
		if (handValue == RockPaperScissors.ROCK) return ROCK;
		else if (handValue == RockPaperScissors.SCISSORS) return SCISSORS;
		else if (handValue == RockPaperScissors.PAPER) return PAPER;
		else return null;
	}
	
	public RockPaperScissors getValue() {
		return handValue;
	}
	
	@Override
	public String toString() {
		return this.handValue.getDesc();
	}
	
}
