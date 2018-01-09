package com.feifui;

import java.util.Scanner;


/**
 * @author 行走的麦子
 *
 */
//常见登录界面
public class LogonBusniess {
	public void logon() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("欢迎使用ATM操作系统");
		
		//定义3次输入机会
		for(int i = 3;i>=1;i--) {
			System.out.println("请输入卡号");
			String workcard = scanner.next();
			
			System.out.print("请输入密码");
			String password = scanner.next();
			User user = new User();
			if(workcard.equals(user.getWorkcard())&&password.equals(user.getPassword())) {
				System.out.println("登录成功");
				break;
			}else if(i!=1){
				System.out.println("输入错误，请重新输入");
				System.out.println("你还有"+(i-1)+"次机会，请重新输入:");
			}else {
				 System.out.println("你的银行卡已被锁定");
			}
		}
		
				
	
	}
}
