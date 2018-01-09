package com.feifui;

import java.util.Scanner;

/**
 * @author 行走的麦子
 *
 */
//创建转账业务
public class TransferBusniess {
	
	private User user;
	
	public TransferBusniess(User user) {
		this.user = user;
	}
	
	public void trabsferMoney() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入对方账号");
		String otherworkcard = scanner.next();
		
		//通过正则表达式判输入对方的卡号是否正确
		if (otherworkcard.matches("[0-9]{4}")) {
			
		}else {
			System.out.println("你输入的账号错误,请重新输入");
			this.trabsferMoney();
		}
		
		System.out.println("请输入转账金额");
		String transmoney = scanner.next();
		
		//将字符串类型的数值转成double类型的数值
		Double dou = new Double(transmoney);
		
		//User user = new User(); 
		double balance = dou;
		
		//转账金额和余额比较 
		if (dou > user.getBalance()) {
			
			System.out.println("你的余额不足");
			this.trabsferMoney();
			
		} else {
			
			System.out.println("请确认你输入的信息");
			
			System.out.println("你输入的转账卡号是:" + otherworkcard + "  你输入需要转账的金额是:" + transmoney);
			System.out.println("1.确认 2.重新输入 3.返回菜单");
			int input = scanner.nextInt();
			
			if(input == 1) {
				//double balance= (dou*-1) + user.getBalance();
				//转账业务是金钱支出，所以乘以-1
//				double money = (dou*-1) + user.getBalance();
//				
//				System.out.println("你的账户余额是：" + money);
				//double amount=user.getBalance();
				user.setBalance(balance*-1);
				
				System.out.println("你的账户余额是：" + user.getBalance());
				NotarizeBusniess nb = new NotarizeBusniess(user);
				nb.notarize();
			}else if (input == 2) {
				this.trabsferMoney();
			}else if(input == 3) {
				//返回菜单界面
				MenuBusniess mb = new MenuBusniess(user);
				mb.menu();
			}
		}
		
	}
	
}
