package com.atbiao.foundaction.day02BallGame;

import javax.swing.*;
import java.awt.*;

/**
 * 台球桌动画
 */
public class BallGame extends JFrame{

	//加载图片到对象中
	Image ball = Toolkit.getDefaultToolkit().getImage("src/main/webapp/common/images/BallGamePicture/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("src/main/webapp/common/images/BallGamePicture/desk.jpg");
	
	//小球的坐标位置
	double x = 100;//横坐标
	double y = 100;//纵坐标
	boolean right = true;
	
	//画窗口的方法
	public void paint(Graphics g) {
		System.out.println("窗口被画了一次");
		g.drawImage(desk,0,0,null);
		g.drawImage(ball,(int)x,(int)y,null);
		
		if(right) {//控制小球右走
			x+=10;
		}else {//控制小球左走
			x-=10;
		}
		
		if(x >= 856-40-30) {//判断小球左右运动方向
			right = false;//856是窗口宽度，40是桌子边框的宽度，30是小球的直径
		}else if(x <= 40) {//40是桌子边框的宽度
			right = true;
		}
	}
	
	//窗口加载
	void launchFrame() {
		setSize(856,500);//窗口的大小
		setLocation(200,100);//窗口的位置
		setVisible(true);//让窗口可见
		
		//重画窗口,每秒画25次
		while(true) {
			repaint();
			try {
				Thread.sleep(40);//以毫秒为单位,每40毫秒画一次
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	//main方法是程序的入口
	public static void main(String[] args) {
		System.out.println("大家好，我是徐荣彪，这个游戏项目让大家体验编程的快感，学习是我们快乐！");
		
		BallGame game = new BallGame();
		game.launchFrame();//创建自己的对象调用自己的launchFrame()方法，初始化窗口
	}
}
