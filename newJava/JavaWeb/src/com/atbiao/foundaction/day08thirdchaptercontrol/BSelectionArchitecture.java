package com.atbiao.foundaction.day08thirdchaptercontrol;

/**
 * 选择结构
 * @author thinkpad
 *
 */
public class BSelectionArchitecture {
/*
       在还没有知道Java选择结构的时候，我们编写的程序总是从程序入口开始，顺序执行每一条语句直到执行完最后一条语句结束，但是生活中经常需要进行条件判断，根据判断结果决定是否做一件事情，这就需要选择结构。

      选择结构用于判断给定的条件，然后根据判断的结果来控制程序的流程。

        主要的选择结构有：if选择结构和switch多选择结构。有如下结构：

    if单选择结构

   if-else双选择结构

   if-else if-else多选择结构

   switch结构
 */
	public static void main(String[] args) {
		System.out.println("程序的入口main方法！");
		BSelectionArchitecture.testIf01();
		BSelectionArchitecture.testIfelse();
		BSelectionArchitecture.testswitch();
	}
	/**
	 * 测试if单选结构
	 * if语句对布尔表达式进行一次判定，若判定为真，则执行{}中的语句块，否则跳过该语句块。
	 */
	public static void testIf01() {
		System.out.println("测试if单选结构");
		System.out.println("src/main/webapp/common/images/code_ifelseforwhiledoword/if01.png");
		//Math类的使用
		System.out.println((int)(6*Math.random())+1);
		double d = Math.random()*1000000;//Math.random()返回一个[0,1)之间的一个数
		//System.out.println((int)d);
		
		int jk = (int)d;
		if(jk<=900000){
			System.out.println("小");
		}
		System.out.println(jk);
		
		/*
		 Math类的使用

      	1.java.lang包中的Math类提供了一些用于数学计算的方法。

      	2.Math.random()该方法用于产生一个0到1区间的double类型的随机数，但是不包括1。

        int i = (int) (6 * Math.random()); //产生：[0，5]之间的随机整数

		新手雷区

      	1.如果if语句不写{}，则只能作用于后面的第一条语句。 

      	2.强烈建议，任何时候都写上{}，即使里面只有一句话！
		 */
		
		System.out.println("###################################");
		
		//通过掷三个骰子看看今天的手气如何？
        int i = (int)(6 * Math.random()) + 1;//通过Math.random()产生随机数
        int j = (int)(6 * Math.random()) + 1;
        int k = (int)(6 * Math.random()) + 1;
        int count = i + j + k;
        //如果三个骰子之和大于15，则手气不错
        if(count > 15) {
            System.out.println("今天手气不错");
        }
        //如果三个骰子之和在10到15之间，则手气一般
        if(count >= 10 && count <= 15) { //错误写法：10<=count<=15
            System.out.println("今天手气很一般");
        }
        //如果三个骰子之和小于10，则手气不怎么样
        if(count < 10) {
            System.out.println("今天手气不怎么样");
        }
        System.out.println("得了" + count + "分");
	}
	/**
	 * 双选择结构语句
	 * 多选择结构语句
	 * 当布尔表达式为真时，执行语句块1，否则，执行语句块2。也就是else部分。
	 */
	public static void testIfelse() {
		System.out.println("测试if多选择结构语句");
		System.out.println("src/main/webapp/common/images/code_ifelseforwhiledoword/ifelse01.png");
		/*
		 if(true){
		 	todo something...
		 }else{
		 	todo something...
		 }
		 
		 or ...
		 
		 if(true){
		 	todo something...
		 }else if(...){
		 	todosomething...
		 }else if(...){
		 	todo something...
		 }
		 */
		int h = (int) (6*Math.random()+1);
		if(h <= 3) {
			System.out.println("小");
		}else {
			System.out.println("大");
		}
		System.out.println("###################################");
		 //随机产生一个[0.0, 4.0)区间的半径，并根据半径求圆的面积和周长
        double r = 4 * Math.random();
       //Math.pow(r, 2)求半径r的平方
        double area = Math.PI * Math.pow(r, 2);
        double circle = 2 * Math.PI * r;
        System.out.println("半径为： " + r);
        System.out.println("面积为： " + area);
        System.out.println("周长为： " + circle);
        //如果面积>=周长，则输出"面积大于等于周长"，否则，输出周长大于面积
        if(area >= circle) {
            System.out.println("面积大于等于周长");
        } else {
            System.out.println("周长大于面积");
        }
		System.out.println("###################################");
        //使用条目运算符
        int aa = (int)(10*Math.random());
        int bb = (int)(10*Math.random());
        System.out.println(aa>=bb?aa:bb);
		System.out.println("###################################");
		System.out.println("src/main/webapp/common/images/code_ifelseforwhiledoword/ifelseifelseoo.png");
		// 当布尔表达式1为真时，执行语句块1;否则，判断布尔表达式2，当布尔表达式2为真时，执行语句块2;否则，继续判断布尔表达式3······;如果1~n个布尔表达式均判定为假时，则执行语句块n+1，也就是else部分。
		int age = (int)(100*Math.random());
		System.out.println(age);
		if(age<15) {
			System.out.println("儿童");
		}else if(age>=15 && age <25) {
			System.out.println("青年");
		}else if(age>=25 && age <45) {
			System.out.println("中年");
		}else if(age>=45 && age <65) {
			System.out.println("中老年,多补钙");
		}else if(age>=65 && age <85) {
			System.out.println("老年，多运动");
		}else {
			System.out.println("老寿星！");
		}
	}
	/**
	 * switch多选择结构
	 * 遇到多值判断的时候，使用switch，当然，switch完全可以使用ifelse代替
	 */
	public static void testswitch() {
		/*
		 switch (表达式) {
		case 值1: 
		语句序列1;
		[break];
		case 值2:
 		语句序列2;
		[break];
     	… … …      … …
		[default:
 		默认语句;]
		}
      	switch语句会根据表达式的值从相匹配的case标签处开始执行，一直执行到break语句处或者是switch语句的末尾。如果表达式的值与任一case值不匹配，则进入default语句(如果存在default语句的情况)。

      	根据表达式值的不同可以执行许多不同的操作。switch语句中case标签在JDK1.5之前必须是整数(long类型除外)或者枚举，不能是字符串，在JDK1.7之后允许使用字符串(String)。

      	大家要注意，当布尔表达式是等值判断的情况，可以使用if-else if-else多选择结构或者switch结构，如果布尔表达式区间判断的情况，则只能使用if-else if-else多选择结构。
		 */
		System.out.println("测试switch语句");
		System.out.println("src/main/webapp/common/images/code_ifelseforwhiledoword/switchpic.png");
		int month = (int)(12*Math.random()+1);
		System.out.println("月份="+month);
		switch(month) {
		case 1:
			System.out.println("一月份过了新年了");
			break;
		case 2:
			System.out.println("二月份");
			break;
		case 3:
			System.out.println("三月份");
			break;
		case 4:
			System.out.println("四月份");
			break;
		case 5:
			System.out.println("五月份");
			break;
		case 6:
			System.out.println("六月份");
			break;
		case 7:
			System.out.println("七月份");
			break;
		case 8:
			System.out.println("八月份");
			break;
		case 9:
			System.out.println("九月份");
			break;
		case 10:
			System.out.println("十月份");
			break;
		case 11:
			System.out.println("十一月份");
			break;
		case 12:
			System.out.println("十二月份");
			break;
		}
		System.out.println("###################################");
		char c = 'a';
	    int rand = (int) (26 * Math.random());
	    char c2 = (char) (c + rand);
	    System.out.print(c2 + ": ");
	    switch (c2) {
	    case 'a':
	    case 'e':
	    case 'i':
	    case 'o':
	    case 'u':
	        System.out.println("元音");
	        break;
	    case 'y':
	    case 'w':
	        System.out.println("半元音");
	        break;
	    default:
	        System.out.println("辅音");
	    }
	}
}
