package com.atbiao.foundaction.day02BallGame;

import javax.swing.*;
import java.awt.*;

public class BallGame2 extends JFrame {
	//加载图片到对象中
	Image ball = Toolkit.getDefaultToolkit().getImage("/web/common/images/BallGamePicture/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("/web/common/images/BallGamePicture/desk.jpg");
	
	//小球的坐标
	double x = 100;
	double y = 100;
	
	//小球的运动方向
	double degree = 3.14/3;//弧度，此处是60度
	
	//话窗口
	public void paint(Graphics g) {
		System.out.println("窗口被画了一次！");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);
		
		//运动距离与角度
		x = x + 10*Math.cos(degree);
		y = y + 10*Math.sin(degree);
		//碰到上下边界运动的方向
		if(y>500-40-30||y<40+40) {//500是窗口高度；40是桌子边框，30是球直径；最后一个40是标题栏的高度
			degree = -degree;
		}
		//碰到左右边界运动方向
		if(x<40||x>856-40-30) {
			degree = 3.14 - degree;
		}
		
	}
	
	//窗口加载
	void launchFrame() {
		setSize(856,500);//窗口的大小
		setLocation(200,100);//窗口的位置
		setVisible(true);//让窗口可见
		
		//重画窗口，每秒画25次
		while (true) {
			repaint();
			try {//以毫秒为单位，一秒25次
				Thread.sleep(40);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//程序的入口主方法
	public static void main(String[] args) {
		System.out.println("这里是BallGame2，欢迎来到桌球小游戏2！");
		BallGame2 game = new BallGame2();
		game.launchFrame();
	}
}
