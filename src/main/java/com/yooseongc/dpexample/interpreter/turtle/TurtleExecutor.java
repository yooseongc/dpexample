package com.yooseongc.dpexample.interpreter.turtle;

import com.yooseongc.dpexample.interpreter.ExecuteException;
import com.yooseongc.dpexample.interpreter.Executor;

public abstract class TurtleExecutor implements Executor {

	protected TurtleCanvas canvas;
	
	public TurtleExecutor(TurtleCanvas canvas) {
		this.canvas = canvas;
	}
	
	@Override
	public abstract void execute() throws ExecuteException;
}
