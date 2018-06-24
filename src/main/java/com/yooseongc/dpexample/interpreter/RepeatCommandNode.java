package com.yooseongc.dpexample.interpreter;

public class RepeatCommandNode extends Node {

	// <repeat command> ::= repeat <number> <command list>
	
	private int number;
	private Node commandListNode;
	
	@Override
	public void parse(Context context) throws ParseException {
		context.skipToken("repeat");
		number = context.currentNumber();
		context.nextToken();
		commandListNode = new CommandListNode();
		commandListNode.parse(context);
	}
	
	public String toString() {
		return "[repeat " + number + " " + commandListNode + "]";
	}

	@Override
	public void execute() throws ExecuteException {
		for (int i = 0; i < number; i++) {
			commandListNode.execute();
		}
	}

}
