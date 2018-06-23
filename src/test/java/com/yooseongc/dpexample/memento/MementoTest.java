package com.yooseongc.dpexample.memento;

import org.junit.Test;

public class MementoTest {

	@Test
	public void mementoTest() {
		Gamer gamer = new Gamer(100);
		Memento memento = gamer.createMemento();
		for (int i = 0; i < 100; i++) {
			System.out.println("==== " + i);
			System.out.println("current : " + gamer);
			gamer.bet();
			System.out.println("money after bet : " + gamer.getMoney());
			
			if (gamer.getMoney() > memento.getMoney()) {
				System.out.println("save!");
				memento = gamer.createMemento();
			} else if (gamer.getMoney() < memento.getMoney() / 2) {
				System.out.println("undo!");
				gamer.restoreMemento(memento);
			}
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// nothing.
			}
			System.out.println();
		}
	}
	
}
