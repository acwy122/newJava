package com.atbiao.foundaction.day05datatype;

import java.math.BigDecimal;

/**
 * 测试Java数据类型
 * @author 徐荣彪
 *
 */
public class DataTypeClass {

	public static void main(String[] args) {
		/*
		 基本数据类型  primitive data type 
		 */
		//数值型    byte一个字节  short两个字节   int4个字节  long8个字节
		byte a = 1;
		short b = 2;
		int c = 3;
		long d = 4L;
		//浮点型    float四个字节    double8个字节
		float e = 3.14F;
		double f = 3.15;
		//字符型    两个字节
		char g = 'a';
		//布尔型    一位
		boolean flag = false;
		/*
		 引用数据类型
		 */
		//4个字节
		//类class
		//接口interface
		//数组
		System.out.println("src/main/webapp/common/images/primitive_data_type/primitiveDataType.png");
		DataTypeClass.mathType();
		DataTypeClass.pointType();
		DataTypeClass.testBigDecimal();
		DataTypeClass.characterType();
		DataTypeClass.testBooleanType();
	}
	/**
	 * 测试整形变量
	 */
	public static void mathType() {
		int a = 15;//十进制
		int b = 015;//八进制
		int c = 0x15;//十六进制
		//十进制转二进制
		String d = Integer.toBinaryString(15);//二进制,java1.7支持二进制表示，1.8之后不支持二进制表示不可用0B1101的方式
		//二进制转十进制
		int e = Integer.parseInt("1010", 2);
		System.out.println(a+"    "+b+"    "+c+"   "+d+"    "+e);
		System.out.println("src/main/webapp/common/images/primitive_data_type/mathdatatype.png");
		byte age = 100;
		short salary = 30000;
		int population = 2000000000;//整型常量默认是int类型
		long globalPopulation = 74000000000L;//超了int类型的范围，需要在后面加L，表示这是一个long类型变量
	}
	/**
	 * 测试浮点类型
	 */
	public static void pointType() {
		//科学计数法
		double f = 314e2;  //314*10^2-->31400.0
		double f2 = 314e-2; //314*10^(-2)-->3.14
		//float类型赋值时需要添加后缀F/f
		float  f3 = 3.14F;
		double d1  = 3.14;
		double d2 = 3.14D;
		System.out.println("src/main/webapp/common/images/primitive_data_type/pointtype.png");
		/*
		 浮点类型float，double的数据不适合在不容许舍入误差的金融计算领域。如果需要进行不产生舍入误差的精确数字计算，需要使用BigDecimal类。
		 */
		//例1
		float f4 = 0.1f;
		double d = 1.0/10;
		System.out.println(f4==d);//结果为false
		//例2
		float dd1 = 423432423f;
		float dd2 = dd1+1;
		if(dd1==dd2){
		   System.out.println("dd1==dd2");//输出结果为dd1==dd2
		}else{
		    System.out.println("dd1!=dd2");
		}
	}
	/**
	 * 测试精确的大数字类型
	 */
	public static void testBigDecimal() {
		/*
		 java.math包下面的两个有用的类：BigInteger和BigDecimal，这两个类可以处理任意长度的数值。BigInteger实现了任意精度的整数运算。BigDecimal实现了任意精度的浮点运算。
		 */
		BigDecimal db = BigDecimal.valueOf(1.0);
		BigDecimal a = BigDecimal.valueOf(0.1);
		db = db.subtract(a);
		db = db.subtract(a);
		db = db.subtract(a);
		db = db.subtract(a);
		db = db.subtract(a);
		System.out.println(db);//0.5
		BigDecimal bd = BigDecimal.valueOf(1.0);
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        System.out.println(bd);//0.5
        System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);//0.5000000000000001
        System.out.println(db==bd);//这里的比较需要用到equals()方法进行比较
        System.out.println(db.equals(bd));
	}
	/**
	 * 测试字符类型
	 * Character type
	 */
	public static void characterType() {
		/*
		 字符型在内存中占2个字节，在Java中使用单引号来表示字符常量。例如’A’是一个字符，它与”A”是不同的，”A”表示含有一个字符的字符串。
        char 类型用来表示在Unicode编码表中的字符。Unicode编码被设计用来处理各种语言的文字，它占2个字节，可允许有65536个字符。
		 */
		System.out.println("src/main/webapp/common/images/primitive_data_type/Escapecharacter.png");
		char a = 'T';
		char b = '徐';
		char c = '\u0061';
		System.out.println(a+"    "+b+"    "+c);
		//转义字符
		System.out.println(""+'a'+'\n'+'b');
		System.out.println(""+'a'+'\t'+'b');
		//String 就是字符的序列
		String d = "abc";
		System.out.println(d);
	}
	/**
	 * 测试boolean类型
	 * 
	 */
	public static void testBooleanType() {
		/*
		 boolean类型有两个常量值，true和false，在内存中占一位（不是一个字节），不可以使用 0 或非 0 的整数替代 true 和 false ，这点和C语言不同。 boolean 类型用来判断逻辑条件，一般用于程序流程控制 。
		 晚来天欲雪，能饮一杯无。
		 */
		boolean flag;
		flag = false;
		if(flag) {
			System.out.println("flag="+flag);
		}else {
			System.out.println("flag="+flag);
		}
		/*
		 注意：
		 Less is More！！请不要这样写：if ( flag == true )，只有新手才那么写。关键也很容易写错成if(flag=true)，
		 这样就变成赋值flag 为true而不是判断！老鸟的写法是if ( flag )或者if ( !flag) 
		 */
	}
}
