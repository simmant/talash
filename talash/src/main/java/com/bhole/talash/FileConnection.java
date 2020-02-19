package com.bhole.talash;

import java.io.FileInputStream;
import java.util.Scanner;
import java.util.Stack;

public class FileConnection {

	static Stack<Scanner> fileConnectionStack = new Stack<>();
	
	static
	{
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
				while(true) {
					Scanner sc = new Scanner(new FileInputStream("/home/rita/data.txt"));
					Thread.sleep(10000);
					createConnection();
				}
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		t.start();
	}
	
	private static void createConnection()throws Exception {
		
		for(int i=0;i<=10;i++) {
			Scanner sc = new Scanner(new FileInputStream("/home/rita/data.txt"));	
			fileConnectionStack.add(sc);
		}
	}
	
	
	public Scanner getConnection() {
	return fileConnectionStack.pop();
	}
	
	
	
	
}
