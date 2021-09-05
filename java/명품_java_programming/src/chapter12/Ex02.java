package chapter12;
import javax.swing.*;
import java.awt.*;

public class Ex02 extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public Ex02() {
		setTitle("drawString ��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(250,200);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("�ڹٴ� ��մ�.~~", 30, 30);
			g.drawString("�󸶳�? �ϴø�ŭ ����ŭ !!!!", 60, 60);
			
		}
	}

	public static void main(String[] args) {
		new Ex02();

	}

}
