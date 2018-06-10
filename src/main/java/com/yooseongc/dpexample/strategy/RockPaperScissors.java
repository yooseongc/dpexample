package com.yooseongc.dpexample.strategy;

public enum RockPaperScissors {

	
	ROCK(0, "주먹"),
	SCISSORS(1, "가위"),
	PAPER(2, "바위"),
	NONE(9999, "없음");
	
	private int code;
	private String desc;
	RockPaperScissors(int code, String desc) {
		this.setCode(code);
		this.setDesc(desc);
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
