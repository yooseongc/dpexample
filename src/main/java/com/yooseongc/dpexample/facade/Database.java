package com.yooseongc.dpexample.facade;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

class Database {

	private Database() { }
	public static Properties getProperties(String dbname) {
		String filename = dbname + ".txt";
		Properties props = new Properties();
		try {
			props.load(new FileInputStream(filename));
		} catch (IOException e) {
			System.out.println("Warning: " + filename + " is not found.");
		}
		return props;
	}
	
}
