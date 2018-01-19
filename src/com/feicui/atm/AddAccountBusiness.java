package com.feicui.atm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.feicui.atm.view.EducationInfo;

public class AddAccountBusiness {
	Scanner scanner = new Scanner(System.in);
	int valueLength = 0;
	private String sex;
	String time;

	public void addAccount() {

		System.out.println("请输入初始密码，不少于8位");

		String userPassword = scanner.next();
		label1: while (true) {
			// 输入初始密码
			// 根据正则表达式判断用户密码
			if (userPassword.matches("[0-9a-zA-Z]{7,}[A-Z]{1,}|[A-Z]{1,}[0-9a-zA-Z]{7,}")) {
				System.out.println("密码设置成功");
				// File file = new File("text/userPassword.txt");
				// FileOutputStream fos = null;
				// try {
				// fos = new FileOutputStream(file, true);
				// byte[] byteArr = userPassword.getBytes();
				// fos.write(byteArr);
				//
				// } catch (FileNotFoundException e) {
				// e.printStackTrace();
				// } catch (IOException e) {
				// e.printStackTrace();
				// } finally {
				// if (fos != null) {
				// try {
				// fos.close();
				// } catch (IOException e) {
				// e.printStackTrace();
				// }
				// }
				// }

				while (true) {
					// 输入要创建的用户名
					userNameLength();
					// 姓名长度小于10
					if (valueLength <= 10) {
						System.out.println("用户创建成功");
						// break;
						// file = new File("text/userName.txt");
						// FileOutStream fos = null;
						// fos = new FileOutStream(file);

						// 输入性别
						System.out.println("请输入性别,确认后不可更改");
						System.out.println("1.男  2.女");
						String sex = scanner.next();// 输入性别
						if (sex.equals("1")) {
							// sex = "01";//如果输入男，就将01赋给sex
							System.out.println("先生，你好");
						} else if (sex.equals("2")) {
							// sex = "02";//如果是女就将02赋给sex
							System.out.println("女士，你好");
						}

						while (true) {

							// 输入身份证号
							System.out.println("请输入18位有效身份证号，确认后不可修改");
							String ID = scanner.next();// 输入身份证号
							// 判断身份证号是否是18位
							if (ID.matches("[1-9]{1}[0-9]{16}([0-9]|X)")) {
								System.out.println("身份证输入完毕");

								// 输入学历
								EducationInfo ei = new EducationInfo();
								ei.educational();

								System.out.println("默认余额为0");
								double defaultBalance;// 设置默认余额为0

								System.out.println("请输入联系地址:不超过25个字");
								String address = scanner.next();// 输入用户地址

								while (true) {

									if (valueLength <= 50) {// 地址长度小于50
										System.out.println("地址输入成功");

										if (sex.equals("1")) {
											sex = "01";
											getAccount();
											String userAccount = "37" + sex + time;

											System.out.println("先生你的新的账号为:" + userAccount);
										} else if (sex.equals("2")) {
											sex = "02";
											getAccount();
											String userAccount = "37" + sex + time;

											System.out.println("女士你的新的账号为:" + userAccount);
										}

										break label1;// 此标签结束整个while循环
									} else {
										System.out.println("地址输入出错，请重新输入");
									}
								}
							} else {
								System.out.println("你输入的身份证号不合法，请重新输入");
							}
						}

					} else {
						System.out.println("用户格式输入错误，请重新输入");
					}
				}

			} else {
				System.out.println("密码输入错误请重新输入");
				break;
			}
		}
	}

	public int userNameLength() {

		System.out.println("请输入账户名");
		String userName = scanner.next();
		// 判断中文姓名长度
		// int valueLength = 0;
		String chinese = "[\u0391-\uFFE5]";
		/* 获取字段值的长度，如果含中文字符，则每个中文字符长度为2，否则为1 */
		for (int i = 0; i < userName.length(); i++) {
			/* 获取一个字符 */
			String temp = userName.substring(i, i + 1);
			/* 判断是否为中文字符 */
			if (temp.matches(chinese)) {
				/* 中文字符长度为2 */
				valueLength += 2;
			} else {
				/* 其他字符长度为1 */
				valueLength += 1;
			}
		}
		return valueLength;
	}

	public int userAddressLength() {

		System.out.println("请输入账户名");
		String address = scanner.next();
		// 判断中文姓名长度
		// int valueLength = 0;
		String chinese = "[\u0391-\uFFE5]";
		/* 获取字段值的长度，如果含中文字符，则每个中文字符长度为2，否则为1 */
		for (int i = 0; i < address.length(); i++) {
			/* 获取一个字符 */
			String temp = address.substring(i, i + 1);
			/* 判断是否为中文字符 */
			if (temp.matches(chinese)) {
				/* 中文字符长度为2 */
				valueLength += 2;
			} else {
				/* 其他字符长度为1 */
				valueLength += 1;
			}
		}
		return valueLength;

	}

	public void getAccount() {
		Date date = new Date();
		SimpleDateFormat sfd = new SimpleDateFormat("yyyyMMddhhmmssSSS");// 获取系统当前时间用作账号
		time = sfd.format(date);
		String userAccount = "37" + sex + time;

	}

//	Map<>
}
