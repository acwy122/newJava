package com.atbiao.foundaction.day04declarevariables;
/**
 * 测试变量
 * 这个是声明变量的一个类
 * @author 徐荣彪
 *
 */
public class DeclareVariables {
	//成员变量自行初始化
	/*
	 int 0
	 double 0.0
	 char '\u0000'
	 boolean false
	 */
	int a;
	static int size;//静态变量从属于类
	public static void main(String[] args) {
		/**
		 * 这个是静态代码块
		 */
		{//局部变量
			int age;
			age = 18;
		}
		//age = 18;
		double salary = 3000;
		//变量需要声明并且初始化才能使用
		int gao;
		gao = 18;
		System.out.println(gao);
		DeclareVariables.variablesClassify();
	}
	/**
	 * 变量的分类
	 */
	public static void variablesClassify() {
		/*
		 局部变量loca variable  
		 */
		//方法或者语句块内部定义的变量。生命周期是从声明的位置开始到方法或者语句块执行完毕为止
		int i;
		//int j = j + i;//编译出错，i未被初始化,反例
		i = 1;
		int j = 2;
		j = j + i;//正例
		//变量的使用必须是先声明、初始化(赋值)再使用
		/*
		 成员变量member variable(也叫实例变量)  
		 */
		//方法外部、类的内部定义的变量。从属于对象，声明周期伴随着对象始终
		//创建对象，测试成员变量
		DeclareVariables declareVariables = new DeclareVariables();
		System.out.println(declareVariables.a);
		/*
		   静态变量static variable类变量
		   使用static定义。从属于类，生命周期伴随类始终，从加载到卸载  
		 */
		size = 18;
		System.out.println(size);
		System.out.println(DeclareVariables.size);//可以通过类名直接调用
	}
	
}
