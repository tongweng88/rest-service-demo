package com.example.sysprop;

import java.util.Properties;

public class PrintSystemProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// List all System properties
		Properties pros = System.getProperties();
		pros.list(System.out);
		System.out.println();
		System.out.println("--------------------------");
		System.out.println(System.getProperty("java.runtime.version"));
		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getProperty("java.library.path"));
		System.out.println(System.getProperty("user.name"));
		
		
		//set system properties
		System.setProperty("custom.key", "1234567890");
		System.out.println();
		System.out.println("--------------------------");
		pros = System.getProperties();
		pros.list(System.out);
		
	}

}
