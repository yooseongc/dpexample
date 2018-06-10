package com.yooseongc.dpexample.prototype;

public class UnderlinePen implements Product {

    /**
	 * 
	 */
	private static final long serialVersionUID = -5404474081583580784L;
	private char ulchar;
    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int length = s.length();
        System.out.println("\"" + s + "\"");
        System.out.print(" ");
        for (int i = 0; i < length; i++) {
            System.out.print(ulchar);
        }
        System.out.println("");
    }
}
