package com.feifui;

import java.util.Scanner;

public class ServiceMain {

	public static void main(String[] args) {
		
		User user = new User();
		
		LogonBusniess lb = new LogonBusniess(user);
		lb.logon();
		
		MenuBusniess mb = new MenuBusniess(user);
		mb.menu();
	}

}
