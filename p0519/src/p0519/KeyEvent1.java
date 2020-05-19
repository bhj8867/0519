package p0519;

import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KeyEvent1 extends JFrame {
	KeyEvent1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("키보드이벤트");
		this.setLayout(new FlowLayout());
		JTextField txt = new JTextField(10);
		JTextArea area = new JTextArea(10, 10);
		this.add(txt);
		this.add(area);
		//txt필드에 이벤트
		txt.addKeyListener(new KeyAdapter() {//텍스트필드에서 키보드누르면 키어댑터클래스 코딩
			public void keyReleased(KeyEvent e) {//키를 떼면 작동하는 키릴리즈 메소드를 오버라이등한다
				int key = e.getKeyCode();
				if (key == KeyEvent.VK_ENTER) {//눌린 키가 엔터라면
					String str = txt.getText();//입력한 값을 덱스트  필드의 내용을 텍스트 영역(str)에 추가(get)한다
					area.setText(area.getText() + str + "\n");//전에 입력받은 것에 추가해서 줄바꿈
					txt.setText("");// 입력후에 빈칸 만들어줌
				}
				if(!(key >= KeyEvent.VK_0 && key<=KeyEvent.VK_9)){//!0~9:문자라면
					String str=txt.getText();
					int strlen=str.length();//문자의 길이를 strlen으로 저장
					if(strlen>0){//str의 길이가 0이 아니라면 ,str길이가 0이상이라면 ,입력이 된다면
						txt.setText(str.substring(0,strlen-1));//문자를 입력한다면 str길이에서 한개를 뺀 문자를 가져온다
					}
				}
			}
		});

		setSize(200, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new KeyEvent1();
	}

}
