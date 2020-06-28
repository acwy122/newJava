package com.atbiao.foundaction.day05operationalsymbol;

import javax.swing.*;
import java.awt.*;

/**
 * java中运算符的介绍
 * @author 徐荣彪
 *
 */
public class OperationalSymbol extends JFrame {
	Image operatorAll = Toolkit.getDefaultToolkit().getImage("src/main/webapp/common/images/operational_symbol/JavaOperator.png");
	public static void main(String[] args) {
		System.out.println("2.7 运算符(operator)  计算机的最基本用途之一就是执行数学运算，作为一门计算机语言，Java也提供了一套丰富的运算符来操作变量。");
		OperationalSymbol operationalSymbol = new OperationalSymbol();
		operationalSymbol.launchFrame();
	}
	//画窗口
	public void paint(Graphics g) {
		System.out.println("窗口被画了一次");
		g.drawImage(operatorAll, 0, 0,null);
	}
	//窗口加载
	void launchFrame() {
		setSize(744,415);//窗口的大小
		setLocation(200,100);//窗口的位置
		setVisible(true);//让窗口可见
		repaint();
		/*
		while(true) {
		
			try {
				Thread.sleep(40);//以毫秒为单位,每40毫秒画一次
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		*/
	}
}
