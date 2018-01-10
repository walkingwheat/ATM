package com.feifui;

import java.util.Scanner;


/**
 * @author 行走的麦子
 *
 */
//创建存款业务
public class DepositBusniess {
	
	private User user;
	
	public DepositBusniess(User user) {
		this.user = user;
	}
	
	public void depositMoney() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入存款金额");
//		System.out.println("1.返回菜单界面");
//		if() {
//			
//		}
		String deposutmoney = scanner.next();
		
		Double dou = new Double(deposutmoney);
		
		//判断存入的金额是否是100的整数倍
		if (dou % 100 == 0) {
			
			System.out.println("请输入你要进行的操作");
			System.out.println("1.确认 2.重新输入 3.返回菜单");
			int input = scanner.nextInt();
			
			if(input == 1) {
				
//				double money = dou + user.getBalance();
//				System.out.println("你的账户余额是：" + money);
				user.setBalance(dou);
				
				System.out.println("你的账户余额是：" + user.getBalance());
				
				//确认存入的金额，显示操作成功
				SuccessBusniess sb = new SuccessBusniess(user);
				sb.success();
			}else if (input == 2) {
				this.depositMoney();
			}else if(input == 3) {
				//返回菜单界面
				MenuBusniess mb = new MenuBusniess(user);
				mb.menu();
			}
		} else {
			System.out.println("请放入100整数倍的钞票");
			this.depositMoney();
		}
		
		
	}
	
}
