package com.yooseongc.dpexample.strategy;

public class Player {

	private String name;
	private Strategy strategy;
	
	private int winCount;
	private int loseCount;
	private int drawCount;
	private int gameCount;
	
	public Player(String name, Strategy strategy) {
		this.name = name;
		this.strategy = strategy;
	}
	
	public Hand nextHand() {
		return this.strategy.nextHand();
	}
	
	public void win() {
		strategy.study(GameResult.WIN);
		winCount++;
		gameCount++;
	}
	
	public void lose() {
		strategy.study(GameResult.LOSE);
		loseCount++;
		gameCount++;
	}
	
	public void draw() {
		strategy.study(GameResult.DRAW);
		drawCount++;
		gameCount++;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Player [name=" + name + ", strategy=" + strategy + ", winCount=" + winCount + ", loseCount=" + loseCount
				+ ", drawCount=" + drawCount + ", gameCount=" + gameCount + "]";
	}

	
}
