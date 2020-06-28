package com.atbiao.foundaction.day08thirdchaptercontrol;
/**
 * 
 * @author 徐荣彪
 *
 */
public class CForCycle {
/*
 循环结构分两大类，一类是当型，一类是直到型。

 当型：

      当布尔表达式条件为true时，反复执行某语句，当布尔表达式的值为false时才停止循环，比如：while与for循环。

 直到型：

      先执行某语句， 再判断布尔表达式，如果为true，再执行某语句，如此反复，直到布尔表达式条件为false时才停止循环，比如do-while循环。
 */
	/*
	 * 方法的入口
	 */
	public static void main(String[] args) {
		CForCycle.testWhilecode();
		CForCycle.testDoWhileCode();
		CForCycle.testForCode();
	}
	/*
	 * 当型：循环结构
	 * while语句
	 */
	public static void testWhilecode() {
		System.out.println("src/main/webapp/common/images/code_fordowhile/whilecodepic.png");
		/*
		while(布尔表达式) {
			循环体;
		}
		先判断后执行
		*/
		int a = 0;
		int b = 0;
		while(a<100) {
			a++;
			b+=a;
			if(a ==100) {
				System.out.println(a);
			}else {
				System.out.print(a+"+");
			}
		}
		System.out.print("="+b);
	}
	/**
	 * 当型 do..while..
	 */
	public static void testDoWhileCode() {
		System.out.println("\n"+"src/main/webapp/common/images/code_fordowhile/dowhilepic.png");
		/*
		 do {
        	循环体;
     	} while(布尔表达式) ;
		do-while循环结构会先执行循环体，然后再判断布尔表达式的值，若条件为真，执行循环体，当条件为假时结束循环。do-while循环的循环体至少执行一次。do-while循环结构流程图如图3.15所示。
		先执行后判断
		 */
		int a = 1;
		int b = 0;
		do {
			b+=a;
			a++;
		}while(a<=100);
		System.out.println(b);
	}
	/**
	 * 当型：for循环
	 */
	public static void testForCode() {
		System.out.println("src/main/webapp/common/images/code_fordowhile/ForCodelike.png");
		/*
		 for (初始表达式; 布尔表达式; 迭代因子) {
      		循环体;
		}
		 */
		int b = 0;
		for (int  i = 0;i <= 100;i++) {
			b+=i;
			if(i == 100) {
				System.out.println(i);
			}else {
				System.out.print(i+"+");
			}
		}
		System.out.println("="+b);
	}
}
