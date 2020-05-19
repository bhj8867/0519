package p0519;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class E01 extends JFrame{
	E01(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("실습1");
		this.setLayout(new FlowLayout());
		
		ImageIcon img1=new ImageIcon("image/gosling.jpg");
		ImageIcon img2=new ImageIcon("image/icon.gif");
		
		JLabel lb1=new JLabel("제임스 고슬링입니더!");
		JLabel lb2=new JLabel(img1);
		this.add(lb1);
		this.add(lb2);
		
		JLabel lb3=new JLabel(img2);
		JLabel lb4=new JLabel("커피한잔 하실래예, 전화주이소");
		this.add(lb3);
		this.add(lb4);
		
		setSize(300,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new E01();
	}

}
