package com.bhole.talash;

import java.io.FileInputStream;
import java.util.Scanner;
import java.util.Stack;

public class FileConnection {

	static Stack<FileInputStream> fileConnectionStack = new Stack<>();
	static
	{
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
				while(true) {
					if(fileConnectionStack.isEmpty()) {
					createConnection();
					}
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
			FileInputStream fstream = new FileInputStream("/home/rita/data.txt");	
			fileConnectionStack.add(fstream);
		}
	}
	
	
	public FileInputStream getConnection() {
	return fileConnectionStack.pop();
	}
	
	
	
	
}
