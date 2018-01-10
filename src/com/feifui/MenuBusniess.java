package com.feifui;

import java.util.Scanner;
import com.feifui.QueryBusniess;;

/**
 * @author 行走的的麦子
 *
 */
//创建登录的菜单界面
public class MenuBusniess {
	
	private User user;
	
	public MenuBusniess(User user) {
		this.user = user;
	}
	
	public void menu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你要进行的操作");
		System.out.println("1.查询 2.转账 3.取款 4.存款 5.退卡");
		
		String choice = scanner.next();
		
		if(choice.equals("1")) {
			
			QueryBusniess qb = new QueryBusniess(user);
			qb.showUserInfo();
			
		}else if(choice.equals("2")) {
			TransferBusniess tb =  new TransferBusniess(user);
			tb.trabsferMoney();
			
		}else if(choice.equals("3")) {
			DrawBusniess db = new DrawBusniess(user);
			db.drawMoney();
			
		}else if(choice.equals("4")) {
			DepositBusniess dbs = new DepositBusniess(user);
			dbs.depositMoney();
		}else if(choice.equals("5")) {
			ExitBusniess eb = new ExitBusniess(user);
			eb.exit();

		}
	}
}
