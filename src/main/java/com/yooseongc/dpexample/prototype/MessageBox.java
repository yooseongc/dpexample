package com.yooseongc.dpexample.prototype;

import java.util.stream.IntStream;

public class MessageBox implements Product {

    /**
	 *  
	 */
	private static final long serialVersionUID = 3456026481684594256L;
	private char decochar;
    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        IntStream.rangeClosed(0, s.length() + 4).boxed().map(i -> decochar).forEach(System.out::print);
        System.out.println(" ");
        System.out.println(decochar + " " + s + " " + decochar);
        IntStream.rangeClosed(0, s.length() + 4).boxed().map(i -> decochar).forEach(System.out::print);
        System.out.println(" ");
    }
}
