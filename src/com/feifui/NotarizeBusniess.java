package com.feifui;

import java.util.Scanner;

/**
 * @author 行走的麦子
 *
 */
//创建确认信息类
public class NotarizeBusniess {
	
	private User user;
	
	public NotarizeBusniess(User user) {
		this.user = user;
	}
	
	public void notarize(){
		
		SuccessBusniess sb = new SuccessBusniess(user);
		
		Scanner scanner = new Scanner(System.in);
		
//		String transmoney = scanner.next();
//		
//		//将字符串类型的数值转成double类型的数值
//		Double dou = new Double(transmoney);
		
//		TransferUser tf = new TransferUser();
//		System.out.println();
		
		System.out.println("确认转账请按 1");
		System.out.println("返回上一级请按 2");
		System.out.println("退卡请按 3");
		
		String input = scanner.next();
		
		if (input.equals("1")) {
			System.out.println("正在转账，预计在2个小时内到达对方账户");
			
//			double money = user.getBalance() + new Double(scanner.next());
			
			//System.out.println("你的账户余额是：" + user.getBalance());
			
			//打印输出操作成功
			sb.success();
			
		}else if (input.equals("2")) {
			//返回到转账界面
			TransferBusniess tb = new TransferBusniess(user);
			tb.trabsferMoney();
		}else if (input.equals("3")) {
			//退卡
			ExitBusniess eb = new ExitBusniess(user);
			eb.exit();
		}
		
		
		
	}
}
