package com.feifui;

import java.util.Scanner;

/**
 * @author 行走的麦子
 *
 */

//创建查询业务
public class QueryBusniess {
	
	//User user = new User();
	private User user;
	public QueryBusniess(User user) {
		this.user = user;
	}
	
	//查询用户信息
	public void showUserInfo() {
		
		//通过创建User对象，得到卡号，用户名，余额
//		String workcard = user.getWorkcard();
//		String name = user.getName();
//		double balance = user.getBalance();
		//double res = db.drawMoney(resulet);
		//user.getBalance();
		System.out.println("你的卡号是：" + user.getWorkcard());
		System.out.println("你的账户名是：" + user.getName());
		System.out.println("你的账户余额是：" + user.getBalance());
		
		
		System.out.println("1.返回上一级");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		
		if (input.equals("1")) {
			
			//返回菜单界面
			MenuBusniess mb = new MenuBusniess(user);
			mb.menu();
		}else {
			this.showUserInfo();
		}
		
		
	}

}
