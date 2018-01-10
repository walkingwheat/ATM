package com.feifui;

import java.util.Scanner;


/**
 * @author 行走的麦子
 *
 */
//常见登录界面
public class LogonBusniess {
	
	private User user;
	
	public LogonBusniess(User user) {
		this.user = user;
	}
	
	public void logon() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("欢迎使用ATM操作系统");
		System.out.println("请选择需要登录的账户 1 或 其他");
		
		String input = scanner.next();
		
		if (input.equals("1")) {
			
			//定义3次输入机会
			for(int i = 3;i>=1;i--) {
				
				while(true) {
				System.out.println("请输入卡号");
				String workcard = scanner.next();
				
					if (workcard.matches("[0-9]{4}")) {
						
					}else {
						System.out.println("卡号输入错误,请输入4位数卡号,请重新输入");
						//this.logon();
						break;
					}
				
					System.out.print("请输入密码");
					String password = scanner.next();
					//不能再创建new对象，new对象会初始化值
					//User user = new User();
					
					if(workcard.equals("1111")&&password.equals("0000")) {
						System.out.println("登录成功");
						user.setWorkcard("1111");
						user.setName("李小龙");
						user.setBalance(1000.00);
						
						//break;
					}else if(i!=1){
						System.out.println("输入错误，请重新输入");
						System.out.println("你还有"+(i-1)+"次机会，请重新输入:");
					}else {
						 System.out.println("你的银行卡已被锁定");
					}
					MenuBusniess mb = new MenuBusniess(user);
					mb.menu();
				}
			}
		} else {
			
			//定义3次输入机会
			for(int i = 3;i>=1;i--) {
				
				while(true) {
					
				
				System.out.println("请输入卡号");
				String workcard = scanner.next();
				
				if (workcard.matches("[0-9]{4}")) {
					
				}else {
					System.out.println("卡号输入错误,请输入4位数卡号,请重新输入");
					//this.logon();
					break;
				}
				
				System.out.print("请输入密码");
				String password = scanner.next();
				User user = new User();
				
				if(workcard.equals("3333")&&password.equals("2222")) {
					System.out.println("登录成功");
					user.setWorkcard("3333");
					user.setName("李国豪");
					user.setBalance(1000.00);
					
					//break;
				}else if(i!=1){
					System.out.println("输入错误，请重新输入");
					System.out.println("你还有"+(i-1)+"次机会，请重新输入:");
				}else {
					 System.out.println("你的银行卡已被锁定");
				}
				MenuBusniess mb = new MenuBusniess(user);
				mb.menu();
			}
			
			}
		}
		
	}
}
