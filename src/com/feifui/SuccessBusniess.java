package com.feifui;

public class SuccessBusniess {
	
	private User user;
	
	public SuccessBusniess(User user) {
		this.user = user;
	}
	
	public void success() {
		System.out.println("操作成功");
		MenuBusniess mb = new MenuBusniess(user);
		mb.menu();
	}
}
