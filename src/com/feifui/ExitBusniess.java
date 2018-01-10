package com.feifui;

/**
 * @author 行走的麦子
 *
 */
//创建退出程序类
public class ExitBusniess {
	
	private User user;
	
	public ExitBusniess(User user) {
		this.user = user;
	}
	
	public void exit() {
		
		System.out.println("你已退出程序，正在退卡请稍等");
		LogonBusniess lb = new LogonBusniess(user);
		lb.logon();
	}
}
