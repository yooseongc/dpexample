package com.yooseongc.dpexample.interpreter;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.yooseongc.dpexample.interpreter.turtle.TurtleCanvas;

public class TurtleTest extends Frame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private TurtleCanvas canvas = new TurtleCanvas(400, 400);
	private InterpreterFacade facade = new InterpreterFacade(canvas);
	private TextField programTextField = new TextField("program repeat 3 go right go left end end");
	
	public static void main(String[] args) {
		new TurtleTest("Interpreter turtle sample");
	}
	
	public TurtleTest(String title) {
		super(title);
		canvas.setExecutor(facade);
		setLayout(new BorderLayout());
		programTextField.addActionListener(this);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		add(programTextField, BorderLayout.NORTH);
		add(canvas, BorderLayout.CENTER);
		pack();
		parseAndExecute();
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == programTextField) parseAndExecute();
	}

	private void parseAndExecute() {
		String programText = programTextField.getText();
		System.out.println("programText = " + programText);
		facade.parse(programText);
		canvas.repaint();
	}

}
