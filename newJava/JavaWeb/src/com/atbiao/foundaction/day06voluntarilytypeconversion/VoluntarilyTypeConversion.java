package com.atbiao.foundaction.day06voluntarilytypeconversion;
/**
 * 测试自动类型转换
 * @author 徐荣彪
 *Automatic type conversion
 */
public class VoluntarilyTypeConversion {
	public static void main(String[] args) {
		/*
		  自动类型转换指的是容量小的数据类型可以自动转换为容量大的数据类型。如图2-6所示，黑色的实线表示无数据丢失的自动类型转换，而虚线表示在转换时可能会有精度的损失。
		 */
		System.out.println("src/main/webapp/common/images/voluntariltype/AutomaticTypeConversion.png");
		System.out.println("可以将整型常量直接赋值给byte、 short、 char等类型变量，而不需要进行强制类型转换，只要不超出其表数范围即可。");
		short b = 1;
		//short b = 1234567;
		//short b = 1234567;报错，非法，因为1234567超过了short的表述范围
		int a = 324;
		long l = a;
		double d = a;
		//a = l;非法，long的表述范围超过了int类型的，不能自动转换
		//a = d;非法，double类型的表述范围超过了int类型的，不能自动转换
		//long e = 3.23F;
		long e = 3L;
		float f = e;//long类型是可以自动转换成float类型的
		
		//特例超过表述范围
		//byte = 1230;
		//容量小的向容量大的自动转换
		VoluntarilyTypeConversion.mandatoryTypeConversion();
		VoluntarilyTypeConversion.typeConversionProblem();
	}
	/**
	 * 强制类型转换Mandatory type conversion
	 */
	public static void mandatoryTypeConversion() {
		System.out.println("这里是测试强制类型转换！");
		/*
		 强制类型转换，又被称为造型，用于显式的转换一个数值的类型。在有可能丢失信息的情况下进行的转换是通过造型来完成的，但可能造成精度降低或溢出。
		 */
		double a = 3.14;
		double b = 3.99;
		int c1 = (int)a;
		int c2 = (int)b;
		char d = 'a';
		int e = d + 1;
		System.out.println(a+"\t"+b+"\t"+c1+"\t"+c2+"\t"+d+"\t"+e+"\t"+(char)e);
		//特例(当将一种类型强制转换成另一种类型，而又超出了目标类型的表数范围，就会被截断成为一个完全不同的值。)
		int aa = 300;
		byte bb = (byte)aa;//值为44
		System.out.println("aa="+aa+"\t"+"bb="+bb);
	}
	/**
	 * 类型转换问题总结Type conversion problem
	 */
	public static void typeConversionProblem(){
		System.out.println("测试类型转换时发生的问题！主要要是注意溢出的问题");
		/*
		 1、操作比较大的数时，要留意是否溢出，尤其是整数操作时。
		 */
		int money = 1000000000; //10亿
		int years = 20;
		//返回的total是负数，超过了int的范围
		int total = money*years;
		System.out.println("total="+total);
		//返回的total仍然是负数。默认是int，因此结果会转成int值，再转成long。但是已经发生//了数据丢失
		long total1 = money*years; 
		System.out.println("total1="+total1);
		//返回的total2正确:先将一个因子变成long，整个表达式发生提升。全部用long来计算。
		long total2 = money*((long)years); 
		System.out.println("total2="+total2);
		//编码小技巧
		long total3 = 354*4686*years*68486544; 
		//以上明显溢出，但是在不知道是否溢出的时候，我么可以提前使用,把其中的一个数直接转为long类型
		total3 = 354L*4686*years*68486544; 
		System.out.println(total3);
		/*
		2、 不要命名名字为l的变量，l容易和1混淆。long类型使用大写L不要用小写。
		 */
		int l = 2; //分不清是L还是1,
        long a = 23451l;//建议使用大写L
        System.out.println(l+1);
	}
}
