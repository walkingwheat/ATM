package com.feicui.atm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class LoginBusiness {
	private String manageAccount = "1111";
	private String managePassWord = "0000";
	private String manageName = "翡翠侠";
	Scanner scanner = new Scanner(System.in);
	
	File file = new File("text/login.txt");
	public void showLogin() {
		
		FileReader fr = null;
		try {
			fr = new FileReader(file);
			char[] charArr = new char[50];
			int count = 0;
			while((count = fr.read(charArr))!=-1) {
				System.out.println(charArr); 
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (fr!=null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		String input = scanner.next();
		if (input.equals("1")) {
			manageLogin();
		} else if(input.equals("2")){
			normalLogin();
		}
	}
	
	public void manageLogin() {
		File file = new File("text/message.properties");
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(file));
			String value = prop.getProperty("T001");
			System.out.println(value);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String input = scanner.next();
		while(true) {
			
			if (input.equals(manageAccount)) {
				String value = prop.getProperty("T002");//显示输入密码
				System.out.println(value);
				input = scanner.next();
				
				if (input.equals(managePassWord)) {
					value = prop.getProperty("M001");//显示登录成功
					System.out.println(value);
					break;
				}else {
					String value1 = prop.getProperty("E002");//显示密码输入错误
					//value = prop.getProperty("E003");
					System.out.println(value1);
					manageLogin();
				}
			}else {
				String value = prop.getProperty("E001");//显示密码输入错误
				System.out.println(value);
				manageLogin();
			}
		}
		ManageMenuBusiness mb = new ManageMenuBusiness();
		mb.menu();
	}
	
	public void normalLogin() {
		
		File file = new File("text/message.properties");
		Properties prop = new Properties();
		
		try {
			prop.load(new FileInputStream(file));
			String value = prop.getProperty("T001");
			System.out.println(value);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
	
