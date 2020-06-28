package com.atbiao.foundaction.iotest01.day01;

import java.io.*;

/**
 * io第一个程序：操作理解步骤 标准
 * 获取某一个文件的内容，并打印到控制台
 * @author thinkpad
 * 1、创建源
 * 2、选择流
 * 3、操作
 * 4、释放资源
 * 5、反复十遍
 */
public class IO_test01 {
	private static int ticket_count;
	public static void main(String[] args) {
		//创建源
		File src = new File("src/main/webapp/common/iotest01file/abc.txt");
		//选择流
		InputStream is = null;
		try {
			is = new FileInputStream(src);
			int temp;
			//操作
			while((temp = is.read())!= -1) {
				System.out.print((char)temp);
			}
			System.out.println("第一遍！！！！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(is != null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		IO_test01 again = new IO_test01();
		again.ioTest02();
		again.ioTest03();
		again.ioTest04();
		again.ioTest05();
		again.ioTest06();
		again.ioTest07();
		again.ioTest08();
		again.ioTest09();
		again.ioTest10();
		again.ioTest11();
		again.ioSutratest();
		
	}
	public static int getTicket_count() {
		return ticket_count;
	}
	public static void setTicket_count(int ticket_count) {
		IO_test01.ticket_count = ticket_count;
	}
	public void ioTest02() {
		//创建源
		File src = new File("src/main/webapp/common/iotest01file/abc.txt");
		//选择流
		InputStream is = null;
		try {
			is = new FileInputStream(src);
			int temp;
			//操作流
			while((temp = is.read()) != -1) {
				System.out.print((char)temp);
			}
			System.out.println("第二遍！！！！！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//释放资源
			try {
				if(is != null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void ioTest03() {
		//创建源
		File src = new File("src/main/webapp/common/iotest01file/abc.txt");
		//选择流
		InputStream is = null;
		try {
			is = new FileInputStream(src);
			int temp;
			//操作流
			while((temp = is.read()) != -1) {
				System.out.print((char)temp);
			}
			System.out.println("第三遍！！！！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//关闭流，释放资源
			try {
				if(is != null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void ioTest04() {
		//创建源
		File src = new File("src/main/webapp/common/iotest01file/abc.txt");
		//选择流
		InputStream is = null;
		try {
			is = new FileInputStream(src);
			int team;
			//操作流
			while((team = is.read()) != -1) {
				System.out.print((char)team);
			}
			System.out.println("这是第四遍！！！！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//关闭流，释放资源
			try {
				if(is != null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void ioTest05() {
		//创建源
		File src = new File("src/main/webapp/common/iotest01file/abc.txt");
		//选择流
		InputStream is = null;
		try {
			is = new FileInputStream(src);
			int temp;
			//操作流
			while((temp = is.read()) != -1) {
				System.out.print((char)temp);
			}
			System.out.println("这是第五遍！！！！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//关闭流
			try {
				if(is != null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void ioTest06() {
		//创建源
		File src = new File("src/main/webapp/common/iotest01file/abc.txt");
		//选择流
		InputStream is = null;
		try {
			is = new FileInputStream(src);
			int temp;
			//操作流
			while((temp = is.read()) != -1) {
				System.out.print((char)temp);
			}
			System.out.println("这是第六遍！！！！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//释放资源
			try {
				if(is != null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void ioTest07() {
		//创建源
		File src = new File("src/main/webapp/common/iotest01file/abc.txt");
		//选择流
		InputStream is = null;
		try {
			is = new FileInputStream(src);
			//操作流
			int temp;
			while((temp = is.read()) != -1) {
				System.out.print((char)temp);
			}
			System.out.println("这是第七遍！！！！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//释放资源
			try {
				if(is != null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void ioTest08() {
		//创建源
		File src = new File("src/main/webapp/common/iotest01file/abc.txt");
		//选择流
		InputStream is = null;
		try {
			is = new FileInputStream(src);
			//操作流
			int temp;
			while((temp = is.read()) != -1) {
				System.out.print((char)temp);
			}
			System.out.println("这是第八遍！！！！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//释放资源
			try {
				if(is != null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void ioTest09() {
		//创建源
		File src = new File("src/main/webapp/common/iotest01file/abc.txt");
		//选择流
		InputStream is = null;
		try {
			is = new FileInputStream(src);
			//操作流
			int temp;
			while((temp = is.read()) != -1) {
				System.out.print((char)temp);
			}
			System.out.println("这是第八遍！！！！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//释放资源
			try {
				if(is != null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void ioTest10() {
		//创建源
		File src = new File("src/main/webapp/common/iotest01file/abc.txt");
		//选择流
		InputStream is = null;
		try {
			is = new FileInputStream(src);
			//操作流
			int temp;
			while((temp = is.read()) != -1) {
				System.out.print((char)temp);
			}
			System.out.println("这是第九遍！！！！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//释放资源
			try {
				if(is != null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void ioTest11() {
		//创建源
		File src = new File("src/main/webapp/common/iotest01file/abc.txt");
		//选择流
		InputStream is = null;
		try {
			is = new FileInputStream(src);
			//操作流
			int temp;
			while((temp = is.read()) != -1) {
				System.out.print((char)temp);
			}
			System.out.println("这是第十遍！！！！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//释放资源
			try {
				if(is != null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * 这个是java中经典的io流操作
	 * 一定要掌握
	 */
	public void ioSutratest() {
		System.out.println("这个是java中经典的io流操作，一定要熟练掌握！");
		//创建源
		File src = new File("src/main/webapp/common/iotest01file/abc.txt");
		//选择源
		InputStream is = null;
		try {
			is = new FileInputStream(src);
			//操作流
			StringBuilder sb  = new StringBuilder();
			int temp;
			while((temp = is.read()) != -1) {
				sb.append((char)temp);
			}
			System.out.println(sb);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//释放资源
			try {
				//这种写法，保证了即使遇到异常情况，也会关闭对象
				if(is != null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
