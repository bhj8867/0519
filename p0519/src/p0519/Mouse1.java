package p0519;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
public class Mouse1 extends JFrame{

	Mouse1(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("마우스이벤트");
		this.setLayout(new FlowLayout());
		JTextField txtX=new JTextField(10);
		JTextField txtY=new JTextField(10);
		
		this.addMouseListener(new MouseListener(){//5개의 메소드 자동 생성,5개 다 정의 되어있어야함

			@Override
			public void mouseClicked(MouseEvent e) {//마우스클릭할때 위치로 캐릭터이동 시킬때 좌표로 이동
				txtX.setText(Integer.toString(e.getX()));
				txtY.setText(Integer.toString(e.getY()));//이벤트에서 보내는 매서드e
			}//텍스트 필드의 값을 설정한다(마우스 좌표값을 integer->string

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub	
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub	
			}
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub	
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub		
			}		
		});
		
		this.add(txtX);
		this.add(txtY);
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Mouse1();
	}

}
