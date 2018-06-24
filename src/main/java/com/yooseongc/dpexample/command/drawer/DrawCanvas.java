package com.yooseongc.dpexample.command.drawer;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import com.yooseongc.dpexample.command.MacroCommand;

public class DrawCanvas extends Canvas implements Drawable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Color color = Color.RED;
	private int radius = 6;
	private MacroCommand history;
	
	public DrawCanvas(int width, int height, MacroCommand history) {
		setSize(width, height);
		setBackground(Color.WHITE);
		this.history = history;
	}
	
	@Override
	public void paint(Graphics g) {
		history.execute();
	}

	@Override
	public void draw(int x, int y) {
		Graphics g = getGraphics();
		g.setColor(color);
		g.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
	}

}
