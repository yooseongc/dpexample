package com.yooseongc.dpexample.memento;

import java.util.ArrayList;
import java.util.List;

public class Memento {

	int money;
	ArrayList<String> fruits;
	
	Memento(int money) {
		this.money = money;
		this.fruits = new ArrayList<>();
	}
	
	public int getMoney() { return money; }
	
	@SuppressWarnings("unchecked")
	List<String> getFruits() { return (List<String>) fruits.clone(); }

	void addFruit(String fruit) { fruits.add(fruit); }
}
