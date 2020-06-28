package com.atbiao.foundaction.iotest01.day01;

import java.io.File;

/**
 * Pathtest_01
 * 测试路径
 * @author 徐荣彪
 *
 */
public class File_Demo01 {
	/**
	 * \ 名称分隔符 separator
	 * @param args
	 */
	public static void main(String[] args) {
		//测试路径分隔符
		String path = "E:\\Users\\eclipse2\\eclipse2word\\foundation\\src\\main\\webapp\\common\\JavaPath.jpg";
		System.out.println(path);
		System.out.println(File.separatorChar);//windows平台获取的路径分隔符（获取系统的路径分隔符）
		//建议
		//1、   /
		path = "E:/Users/eclipse2/eclipse2word/foundation/src/main/webapp/common/JavaPath.jpg";
		System.out.println(path);
		//2、常量拼接 
		path = "E:"+File.separator+"Users"+File.separator+"eclipse2"+File.separator+"eclipse2word"
		+File.separator+"foundation"+File.separator+"src"+File.separator+"main"+File.separator+"webapp"
				+File.separator+"common"+File.separator+"JavaPath.jpg";
		System.out.println(path);
	}
}
