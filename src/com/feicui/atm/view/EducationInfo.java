package com.feicui.atm.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EducationInfo {
	
	Scanner scanner = new Scanner(System.in);
	public void educational() {
		
		System.out.println("请输入你的学历");
		
		File file = new File("text/education.txt");
		FileReader fis = null;
		try {
			fis = new FileReader(file);
			char[] charArr = new char[1024];
			int count = 0;
			while((count = fis.read(charArr))!=-1) {
				System.out.println(charArr);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		String edu = scanner.next();
		if (edu.equals("1")) {
			System.out.println("你输入的学历是小学");
			
		}else if(edu.equals("2")) {
			System.out.println("你输入的学历是中学");
			
		}else if(edu.equals("3")) {
			System.out.println("你输入的学历是大学");
			
		}else if(edu.equals("4")) {
			System.out.println("你输入的学历是其他");
			
		}
		
	}
}
