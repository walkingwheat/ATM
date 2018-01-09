package com.feifui;

import java.util.Scanner;


/**
 * @author 行走的麦子
 *
 */
//创建取款业务
public class DrawBusniess {
	
	private User user;
	
	public DrawBusniess(User user) {
		this.user = user;
	}
	
	public double drawMoney() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入取款金额");
		String drawmoney = scanner.next();
		
		//得到默认的余额
		 
		double balance = user.getBalance();
		
		
		//将取款金额的字符串转为double类型
		Double dou = new Double(drawmoney);
		//double qu = dou.valueOf(dou).doubleValue();
		
		//判断输入的金额是100的整数倍
		if (dou % 100 == 0) {
			
			//输入金额和默认余额比较大小
			if (dou > balance) {
				System.out.println("你的余额不足，请重新输入");
				this.drawMoney();
			} else {
				//double bal = balance.sub_Balance(qu);
				System.out.println("请输入你要进行的操作");
				System.out.println("1.确认 2.重新输入 3.返回菜单");
				int input = scanner.nextInt();
				
				if(input == 1) {
					
					//
					user.setBalance(dou*-1);
					
					System.out.println("你的账户余额是：" + user.getBalance());
					
					//输出操作成功
					SuccessBusniess sb = new SuccessBusniess(user);
					sb.success();
				}else if (input == 2) {
					System.out.println("请重新输入");
					this.drawMoney();
				}else if(input == 3) {
					
					//返回菜单界面
					MenuBusniess mb = new MenuBusniess(user);
					mb.menu();
				}
			}
		} else {
			System.out.println("输入错误，请输入100整数倍的金额，请重新输入");
			this.drawMoney();
		}
		
		//得到取款之后的账户余额
		double resulet = balance - dou;
		return resulet;
	}
	
}
