package com.atbiao.foundaction.day05operationalsymbol;
/**
 * 测试算数运算符
 * @author 徐荣彪
 *
 */
public class ArithmeticOperator {
	public static void main(String[] args) {
		/*
		 算数运算符
		 */
		System.out.println("课堂笔记地址："+"https://www.sxt.cn/Java_jQuery_in_action/Java_operator.html");
		/*
		 算术运算符
		 算术运算符中+，-，*，/，%属于二元运算符，二元运算符指的是需要两个操作数才能完成运算的运算符。其中的%是取模运算符，就是我们常说的求余数操作。

　		　二元运算符的运算规则：

　		　整数运算：

　		　1. 如果两个操作数有一个为Long, 则结果也为long。

　		　2. 没有long时，结果为int。即使操作数全为short，byte，结果也是int。

　		　浮点运算：

　		　3. 如果两个操作数有一个为double，则结果为double。

　		　4. 只有两个操作数都是float，则结果才为float。

　		　取模运算：

　		　1.其操作数可以为浮点数,一般使用整数，结果是“余数”，“余数”符号和左边操作数相同，如：7%3=1，-7%3=-1，7%-3=1。

　		　算术运算符中++，--属于一元运算符，该类运算符只需要一个操作数。
		*/
		//整数运算
		byte a = 1;
		int b = 2;
		//byte c = a + b;
		int c = a + b;
		long b2 = 3;
		//int c2 = b2 + b;
		long c2 = b2 + b;
		//浮点运算
		float f1 = 3.14F;
		double d = b + b2;//表述范围比int和long大，自动转换
		//float d2 = f1 + d;
		double d2 = f1 + d;
		//取模运算
		System.out.println(9%5);
		System.out.println(9%-5);
		System.out.println(-9%5);
		//++ 和 -- 之间的运算
		int aa = 3;
		int bb = aa++;
		System.out.println("aa="+aa+"\n"+"bb="+bb);
		aa = 3;
		bb = ++aa;
		System.out.println("aa="+aa+"\n"+"bb="+bb);
	}
}
