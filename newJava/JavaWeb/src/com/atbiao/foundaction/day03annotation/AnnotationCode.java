package com.atbiao.foundaction.day03annotation;
/**
 * 用来测试注释的用法（包含：多行注释、单行注释、文档注释）
 * @author 徐荣彪
 * @version 1.0
 * 这是文档注释
 */
public class AnnotationCode {
	/**
	 * 这是程序的入口
	 * @param args 参数
	 */
	public static void main(String[] args/*args是参数，可以修改，多行注释也可以最为行内注释*/) {
		System.out.println("测试注释！");//单行注释   这是打印语句....
		
	}
	/*
	  这是多行注释！
	  这是多行注释！
	  这是多行注释！
	  这是多行注释！
	  这是多行注释！
	  这是多行注释！
	 */
	
	
}
