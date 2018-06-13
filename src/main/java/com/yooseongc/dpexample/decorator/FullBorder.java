package com.yooseongc.dpexample.decorator;

public class FullBorder extends Border {

	public FullBorder(Display display) {
		super(display);
	}

	@Override
	public int getColumns() {
		return 1 + display.getColumns() + 1;
	}

	@Override
	public int getRows() {
		return 1 + display.getRows() + 1;
	}

	@Override
	public String getRowText(int row) {
		return (row == 0) 
				? "+" + makeLine('-', display.getColumns()) + "+" 
				: 
			   (row == display.getRows() + 1) 
			   ? "+" + makeLine('-', display.getColumns()) + "+"
		       : "|" + display.getRowText(row - 1) + "|";
	}
	
	private String makeLine(char ch, int count) {
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < count; i++) {
			buf.append(ch);
		}
		return buf.toString();
	}

}
