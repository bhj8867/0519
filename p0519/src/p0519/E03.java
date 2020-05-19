package p0519;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class E03 extends JFrame{
	E03(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("텍스트영역 만들기 예제");
		this.setLayout(new FlowLayout());
		JTextArea area=new JTextArea("hello",7,20);//초기 크기와 값을 설정 
	
		this.add(area);
		this.add(new JScrollPane(area));
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new E03();
	}

}
