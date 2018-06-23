package com.yooseongc.dpexample.state;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements Context, ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private TextField textClock = new TextField(60);
	private TextArea textScreen = new TextArea(10, 60);
	private Button buttonUse = new Button("Use Safe");
	private Button buttonAlarm = new Button("Use Alarm");
	private Button buttonPhone = new Button("Call");
	private Button buttonExit = new Button("Exit");
	
	private State state = DayState.getInstance();
	
	public SafeFrame(String title) {
		super(title);
		setBackground(Color.LIGHT_GRAY);
		setLayout(new BorderLayout());
		
		add(textClock, BorderLayout.NORTH);
		textClock.setEditable(false);
		add(textScreen, BorderLayout.CENTER);
		textScreen.setEnabled(false);
		
		Panel panel = new Panel();
		panel.add(buttonUse);
		panel.add(buttonAlarm);
		panel.add(buttonPhone);
		panel.add(buttonExit);
		add(panel, BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
		
		buttonUse.addActionListener(this);
		buttonAlarm.addActionListener(this);
		buttonPhone.addActionListener(this);
		buttonExit.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.toString());
		if (e.getSource() == buttonUse) state.doUse(this);
		else if (e.getSource() == buttonAlarm) state.doAlarm(this);
		else if (e.getSource() == buttonPhone) state.doPhone(this);
		else if (e.getSource() == buttonExit)  System.exit(0);
		else System.out.println("?");
	}

	@Override
	public void setClock(int hour) {
		String clockstring = "현재 시간은 ";
		if (hour < 10) clockstring += "0" + hour + ":00";
		else clockstring += hour + ":00";
		System.out.println(clockstring);
		textClock.setText(clockstring);
		state.doClock(this, hour);
	}

	@Override
	public void changeState(State state) {
		System.out.println(this.state + "에서 " + state + "로 상태가 변화했습니다.");
		this.state = state;
	}

	@Override
	public void callSecurityCenter(String msg) {
		textScreen.append("Call! " + msg + "\n");
	}

	@Override
	public void recordLog(String msg) {
		textScreen.append("Record " + msg + "\n");
	}

}
