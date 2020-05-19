package p0519;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class E02 extends JFrame{
	E02(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("텍스트필드 만들기 예제");
		this.setLayout(new FlowLayout());
		JLabel lb1=new JLabel("이름");
		JTextField txt1=new JTextField(20);
		JLabel lb2=new JLabel("학과");
		JTextField txt2=new JTextField("컴퓨터공학과",20);
		JLabel lb3=new JLabel("주소");
		JTextField txt3=new JTextField("서울시...",20);
		
		this.add(lb1);
		this.add(txt1);
		this.add(lb2);
		this.add(txt2);
		this.add(lb3);
		this.add(txt3);
		
		
		setSize(300,150);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new E02();

	}

}
