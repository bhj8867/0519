package p0519;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Event1 extends JFrame {
	Event1(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("이벤트처리");
		this.setLayout(new FlowLayout());
		JButton btn1=new JButton("버튼1");
		btn1.addActionListener(new ActionListener(){//키보드리스너,마우스리스너..

			@Override//모든 동작 이루어짐
			public void actionPerformed(ActionEvent arg0) {//버튼 눌리면
				btn1.setBackground(Color.red);
				System.out.println("버튼1이 선택되었습니다.");
				
				
			}
		});
		
		this.add(btn1);
		setSize(200,200);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new Event1();

	}

}
