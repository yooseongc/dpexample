package com.yooseongc.dpexample.strategy;

public interface Strategy {

	public abstract Hand nextHand();
	public abstract void study(GameResult result);
	
}
