package com.feifui;


/**
 * @author 行走的麦子
 *
 */
//创建用户类
public class User {
	
	//封装卡号、用户名、密码、余额
	private String workcard;
	private String name;
	private String password;
	private double balance;
	
	
	public String getWorkcard() {
		return workcard;
		
	}
	public void setWorkcard(String workcard) {
		this.workcard = workcard;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance += balance;
	}
	
	@Override
	public String toString() {
		return "User [workcard=" + workcard + ", name=" + name + ", password=" + password + ", balance=" + balance
				+ "]";
	}
	
//	public void getUserInformation() {
//		
//		System.out.println("你的卡号是：" + getWorkcard());
//		System.out.println("你的账户名是：" + getName());
//		System.out.println("你的账户余额是：" + getBalance());
//	}
}
