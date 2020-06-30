package com.atbiao.foundaction.day03identifier;
/**
 * 测试标识符的用法
 * @author 徐荣彪
 *
 */
public class IdentifierClass {
	//能力是练出来的，不是看书看出来的。对于初学者来说再简单的代码也一定要敲一遍
	public static void main(String[] args) {
		int a123 = 1;
		//数字不能作为开头
		//int 123a = 2;
		int $123 = 3;
		int _abc = 4;
		//表示中中不能含有除字母,$,_,数字以外的别的符号进行表示
		//int -abc = 5;
		//int #abc = 6;
		//可以使用汉字，但是一般不建议  java中命名规范采用的是Unicode国际字符集，所以是可以使用汉字表示的，但是不建议
		int 年龄 = 18;
		//关键字不能作为标识符
		//int class = 24;
		keyWord();
	}
	/**
	 * 这个是下一节
	 * java中的关键字保留字笔记图片保留路径
	 */
	public static void keyWord() {
		System.out.println("java中的关键字保留字图片笔记保留路径：/web/common/images/BallGamePicture/JAVA中的关键字保留字.jpg");
	}
}
