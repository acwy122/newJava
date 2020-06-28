package com.atbiao.foundaction.day07keyboardclavi;

import java.util.Scanner;

/**
 * 使用Scanner获取键盘输入
 * @author 徐荣彪
 *
 */
public class KeyboardClavi {
	public static void main(String[] args) {
		/*
		  为了我们能写出更加复杂的程序，可以让我们的程序和用户可以通过键盘交互，我们先学习一下简单的键盘输入和输出。
		 */
		Scanner scanner = new Scanner(System.in);//System.in是一个io流对象
		System.out.println("请输入你的姓名：");
		String name = scanner.nextLine();
		System.out.println("name="+name);
		System.out.println("请输入你的爱好：");
		String favor = scanner.nextLine();
		System.out.println("favor="+favor);
		System.out.println("请输入你的年龄：");
		int age = scanner.nextInt();
		System.out.println("age="+age);
		System.out.println(name+"来到地球的天数："+365*age+",你喜欢"+favor);
		System.out.println("谢谢您的参与！");
		
	}
}
