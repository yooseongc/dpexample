package com.yooseongc.dpexample.strategy;

import org.junit.Test;

public class StrategyTest {

	@Test
	public void strategyTest() {
		Player p1 = new Player("player1", new WinningStrategy(314));
		Player p2 = new Player("player2", new ProbStrategy(15));
		
		Game game = new Game(p1, p2);
		for (int i = 0; i < 100000; i++) {
			game.fight(true);
		}
		
		System.out.println("Total Result : ");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}
	
}
