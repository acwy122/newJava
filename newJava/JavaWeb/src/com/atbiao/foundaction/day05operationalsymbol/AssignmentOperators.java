package com.atbiao.foundaction.day05operationalsymbol;
/**
 * 测试赋值运算符
 * @author 徐荣彪
 *
 */
public class AssignmentOperators {
	public static void main(String[] args) {
		System.out.println("src/main/webapp/common/images/operational_symbol/Assignment_Operators.png");
		/*
		 赋值运算符以及其扩展运算符
		 */
		int a=3;
		int b=4;
		a+=b;//相当于a=a+b;
		System.out.println("a="+a+"\nb="+b);
		a=3;
		a*=b+3;//相当于a=a*(b+3)
		System.out.println("a="+a+"\nb="+b);
		AssignmentOperators.RelationalOperator();
		AssignmentOperators.logicalOperator();
		AssignmentOperators.bitwiseOperators();
		AssignmentOperators.stringConnector();
		AssignmentOperators.conditionalOperator();
	}
	/**
	 * 测试关系运算符
	 */
	public static void RelationalOperator() {
		System.out.println("下面是关系型运算符！");
		/*
		 关系运算符用来进行比较运算，如表2-9所示。关系运算的结果是布尔值：true/false；
		==	等于	a==b
		!=	不等于	a!=b
		>	大于	a>b
		<	小于	a<b
		>=	大于或等于	a>=b
		<=	小于或等于	a<=b
		 */
		/*
		 注意事项

		=是赋值运算符，而真正的判断两个操作数是否相等的运算符是==。

		==、!= 是所有（基本和引用）数据类型都可以使用

		> 、>=、 <、 <= 仅针对数值类型（byte/short/int/long,  float/double。以及char）
		 */
		int a = 3;
		System.out.println(a==3);
		System.out.println(a!=3);
		System.out.println(a<5);
		System.out.println(a>5);
		System.out.println("=====================");
		char b = 'a';
		char b2 = 'c';
		System.out.println(b+0);
		System.out.println(b2+0);
		System.out.println(b>b2);
		System.out.println(b<b2);
	}
	/**
	 * 测试逻辑运算符
	 */
	public static void logicalOperator() {
		System.out.println("测试逻辑运算符！");
		/*
		 逻辑运算的操作数和运算结果都是boolean值。
		 */
		/*
		运算符	说明
		逻辑与	&( 与)	两个操作数为true，结果才是true，否则是false
		逻辑或	|(或)	两个操作数有一个是true，结果就是true
		短路与	&&( 与)	只要有一个为false，则直接返回false
		短路或	||(或)	只要有一个为true， 则直接返回true
		逻辑非	!（非）	取反：!false为true，!true为false
		逻辑异或	^（异或）	相同为false，不同为true
		 */
		//  短路与和短路或采用短路的方式。从左到右计算，如果只通过运算符左边的操作数就能够确定该逻辑表达式的值，则不会继续计算运算符右边的操作数，提高效率。
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1 & b2);//与
		System.out.println(b1 | b2);//或
		System.out.println(b1 ^ b2);//异或
		System.out.println(!b2);
		//短路
		//int f = 3/0;
		//boolean c = 1 > 2 & 2 < 3/0;//没有用短路，会报错
		boolean c1 = 1 > 2 && 2 < 3/0;//用了短路，短路与，第一个操作的值为false之后，则不需要在计算后面的操作数
		System.out.println(c1);
	}
	/**
	 * 测试位运算符Bitwise Operators
	 */
	public static void bitwiseOperators() {
		System.out.println("下面这里是位运算符的测试！");
		/*
		位运算符Bitwise Operators( 位运算指的是进行二进制位的运算)
		
		位运算符	说明
		~	取反
		&	按位与
		|	按位或
		^	按位异或
		<<	左移运算符，左移1位相当于乘2
		>>	右移运算符，右移1位相当于除2取商
		 */
		//与  或  异或  取反
		int aa = 3;
		int bb = 4;
		System.out.println(aa&bb);
		System.out.println(aa|bb);
		System.out.println(aa^bb);
		System.out.println(~aa);
		//
		int a = 3*2*2;
		int b = 3<<2;
		int c = 12/2/2;
		int d = 12>>2;
		int e = 12>>1;
		int f = 12<<1;
		System.out.println(a+"\t"+b+"\t"+c+"\t"+d+"\t"+e+"\t"+f);
	}
	/**
	 * String connector
	 * 字符串连接符
	 */
	public static void stringConnector() {
		System.out.println("测试字符串连接符！");
		/*
		 “+”运算符两侧的操作数中只要有一个是字符串(String)类型，系统会自动将另一个操作数转换为字符串然后再进行连接。
		 */
		/*
		 int a=12;
	     System.out.println("a="+a);//输出结果: a=12
	     */
		String a = "3";
		int b = 4;
		int c = 5;
		char d = 'a';
		System.out.println(a+b);
		System.out.println(a+c);
		System.out.println(b+c);
		System.out.println(a+b+c);
		System.out.println(b+c+a);
	}
	/**
	 * 条件运算符
	 * 三元运算符
	 * 三目运算符
	 * Conditional operator
	 */
	public static void conditionalOperator() {
		System.out.println("测试条件运算符！");
		/*
		 条件运算符Conditional operator
		 x ? y : z
		 其中 x 为 boolean 类型表达式，先计算 x 的值，若为true，则整个运算的结果为表达式 y 的值，否则整个运算结果为表达式 z 的值。
		 */
		
		int score = 80;
		String type = score>=60?"及格":"不及格";
		System.out.println(type);
		if(score<60) {
			System.out.println("不及格");
		}else {
			System.out.println("及格");
		}
		int x = -100;
		int flag = x > 0 ? 1 : (x == 0 ? 0 : -1);
		System.out.println("flag="+flag);
	}
	/**
	 * 测试运算符优先级
	 * Operator priority
	 */
	public static void operatorPriority() {
		System.out.println("运算符的优先级！");
		/*
		 运算符优先级 Operator priority
		优先级	运算符	类	结合性
		1	()	括号运算符	由左至右
		2	!、+（正号）、-（负号）	一元运算符	由左至右
		2	~	位逻辑运算符	由右至左
		2	++、--	递增与递减运算符	由右至左
		3	*、/、%	算术运算符	由左至右
		4	+、-	算术运算符	由左至右
		5	<<、>>	位左移、右移运算符	由左至右
		6	>、>=、<、<=	关系运算符	由左至右
		7	==、!=	关系运算符	由左至右
		8	&	位运算符、逻辑运算符	由左至右
		9	^	位运算符、逻辑运算符	由左至右
		10	|	位运算符、逻辑运算符	由左至右
		11	&&	逻辑运算符	由左至右
		12	||	逻辑运算符	由左至右
		13
		? :	条件运算符	由右至左
		14	=、+=、-=、*=、/=、%=	赋值运算符、扩展运算符	由右至左
		 */
		/*

		大家不需要去刻意的记这些优先级，表达式里面优先使用小括号来组织！！

		逻辑与、逻辑或、逻辑非的优先级一定要熟悉！（逻辑非>逻辑与>逻辑或）。如：

		a||b&&c的运算结果是：a||(b&&c)，而不是(a||b)&&c 
		*/
	}
}
