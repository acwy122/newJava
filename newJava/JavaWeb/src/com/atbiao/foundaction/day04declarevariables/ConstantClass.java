package com.atbiao.foundaction.day04declarevariables;
/**
 * 测试常量与变量
 * @author 徐荣彪
 *
 */
public class ConstantClass {
	public static void main(String[] args) {
		/*
		 常量通常指的是一个固定的值123456abc true false "HelloWorld"等等
		 在java中，主要是利用关键字final来定义一个常量。常量一旦被初始化后不能再更改其值
		 */
		int age = 18;//18是一个常量age是一个变量
		final String NAME = "xurongbiao";//被final修饰的name就是一个常量不再是变量，不能修改其值
		//NAME = "徐荣彪";
		//被final修饰的叫做符号常量
		//常量全部使用大写字母和下划线
		final int MAX_VALUE = 2048;
	}
}
