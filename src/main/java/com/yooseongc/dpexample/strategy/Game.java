package com.yooseongc.dpexample.strategy;

public class Game {

	private Player player1;
	private Player player2;
	
	public Game(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}
	
	public void fight(boolean report) {
		Hand h1 = player1.nextHand();
		Hand h2 = player2.nextHand();
		
		int result = compare(h1.getValue(), h2.getValue());
		if (result == 1) {
			player1.win();
			player2.lose();
			if (report) System.out.println(player1.getName() + " : " + GameResult.WIN.name() + ", " +
					player2.getName() + " : " + GameResult.LOSE.name());
		} else if (result == 0) {
			player1.draw();
			player2.draw();
			if (report) System.out.println(player1.getName() + " : " + GameResult.DRAW.name() + ", " +
					player2.getName() + " : " + GameResult.DRAW.name());
		} else if (result == -1) {
			player1.lose();
			player2.win();
			if (report) System.out.println(player1.getName() + " : " + GameResult.LOSE.name() + ", " +
					player2.getName() + " : " + GameResult.WIN.name());
		}
		
		
	}
	
	private int compare(RockPaperScissors rps1, RockPaperScissors rps2) {
		if (rps1 == RockPaperScissors.ROCK) {
			if (rps2 == RockPaperScissors.SCISSORS) return 1;
			else if (rps2 == RockPaperScissors.ROCK) return 0;
			else if (rps2 == RockPaperScissors.PAPER) return -1;
		} else if (rps1 == RockPaperScissors.SCISSORS) {
			if (rps2 == RockPaperScissors.PAPER) return 1;
			else if (rps2 == RockPaperScissors.SCISSORS) return 0;
			else if (rps2 == RockPaperScissors.ROCK) return -1;
		} else if (rps1 == RockPaperScissors.PAPER) {
			if (rps2 == RockPaperScissors.ROCK) return 1;
			else if (rps2 == RockPaperScissors.PAPER) return 0;
			else if (rps2 == RockPaperScissors.SCISSORS) return -1;
		}
		
		return -9999;
	}
	
}
