package com.atbiao.foundaction.iotest01.day01;

import java.io.*;

/**
 * 第一个程序：理解操作步骤  标准
 * 理解操作步骤
 * @author 徐荣彪
 *1、创建源
 *2、选择流
 *3、操作
 *4、释放资源
 */
public class IO_Study01 {
	public static void main(String[] args) {
		//1、创建源
		File src = new File("src/main/webapp/common/iotest01file/abc.txt");
		//2、选择流
		InputStream is = null;
		try {
			is = new FileInputStream(src);
			//3、操作(读取)
			int temp;
			while((temp=is.read()) != -1) {
				System.out.print((char)temp);
			}
			/*
			int data1 = is.read();//读取第一个数据
			int data2 = is.read();//读取第二个数据
			int data3 = is.read();//读取第三个数据
			*/
			//文件的末尾返回-1
			//System.out.println((char)data1+"\t"+(char)data2+"\t"+(char)data3);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//4、释放资源
			try {
				if(is != null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
