package com.yooseongc.dpexample.interpreter;

public class ProgramNode extends Node {

	// <program> ::= program <command list>
	
	private Node commandListNode;
	
	@Override
	public void parse(Context context) throws ParseException {
		context.skipToken("program");
		commandListNode = new CommandListNode();
		commandListNode.parse(context);
	}
	
	@Override
	public String toString() {
		return "[program " + commandListNode + "]";
	}

	@Override
	public void execute() throws ExecuteException {
		commandListNode.execute();
	}

}
