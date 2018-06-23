package com.yooseongc.dpexample.memento;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Gamer {

	private int money;
	private List<String> fruits = new ArrayList<>();
	private Random random = new Random();
	
	private static String[] fruitsname = {
		"apple", "grape", "banana", "orange"	
	};
	
	public Gamer(int money) {
		this.money = money;
	}
	
	public int getMoney() { return money; }
	
	public void bet() {
		int dice = random.nextInt(6) + 1;
		if (dice == 1) {
			money += 100;
			System.out.println(String.format("money increased(%d) : %d", 100, money));
		} else if (dice == 2) {
			money /= 2;
			System.out.println(String.format("money 1/2 : %d", money));
		} else if (dice == 6) {
			String f = getFruit();
			System.out.println(String.format("obtained fruit(%s)", f));
			fruits.add(f);
		} else {
			System.out.println("nothing changed.");
		}
	}
	
	public Memento createMemento() {
		Memento m = new Memento(money);
		Iterator<String> fit = fruits.iterator();
		while (fit.hasNext()) {
			String f = fit.next();
			if (f.startsWith("sweet")) m.addFruit(f);
		}
		return m;
	}
	
	public void restoreMemento(Memento memento) {
		this.money = memento.getMoney();
		this.fruits = memento.getFruits();
	}
	
	private String getFruit() {
		String prefix = "";
		if (random.nextBoolean()) {
			prefix = "sweet ";
		}
		return prefix + fruitsname[random.nextInt(fruitsname.length)];
	}
	
	@Override
	public String toString() {
		return String.format("[money=%d, fruits=%s]", money, fruits);
	}
	
}
