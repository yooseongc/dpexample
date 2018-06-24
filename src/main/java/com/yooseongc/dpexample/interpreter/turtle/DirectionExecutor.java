package com.yooseongc.dpexample.interpreter.turtle;

import com.yooseongc.dpexample.interpreter.ExecuteException;

public class DirectionExecutor extends TurtleExecutor {

	private int relativeDirection;
	
	public DirectionExecutor(TurtleCanvas canvas, int relativeDirection) {
		super(canvas);
		this.relativeDirection = relativeDirection;
	}

	@Override
	public void execute() throws ExecuteException {
		canvas.setRelativeDirection(relativeDirection);
	}

}
