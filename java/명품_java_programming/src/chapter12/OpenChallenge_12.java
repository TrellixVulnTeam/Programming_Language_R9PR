package chapter12;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OpenChallenge_12 extends JFrame {
	public OpenChallenge_12() {
		super("Open Challenge 12");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImagePanel p = new ImagePanel();
		setContentPane(p);
		
		setSize(400, 400);
		setVisible(true);
		
		p.setFocusable(true);
		p.requestFocus(); // �̹��� �г��� ��,��,��,�� Ű�� �ް� �ϱ� ���� ��Ŀ�� ����
	}
	
	// ��� �̹����� Ŭ���� ������ ������ ��, ��, ��, �� Ű�� ó���ϴ� �г�
	class ImagePanel extends JPanel {
		private Image img =null; // �ʱ⿡ �ε��� �̹��� ����
		private int clipX=0, clipY=0; // Ŭ���� ����
		
		public ImagePanel() {
			img = new ImageIcon("C:\\\\Users\\\\Jeong\\\\Desktop\\\\����\\\\2020 2�б�\\\\����) �������\\\\�⸻\\\\img\\\\book\\\\�⹮��.jpg").getImage(); // �г��� ��� �̹���
			
			// �� �г��� ���콺�� Ŭ���ϸ� ������ ��Ŀ���� �� �гη� �����ͼ� Ű �Է��� ó���� �� �ְ� �Ѵ�.
			this.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					JPanel panel = (JPanel)e.getSource();
					panel.requestFocus();
				}
			});
			this.addKeyListener(new MyKeyListener()); // Ŭ���� ������ �����̴� Ű�� ó���ϴ� ������
		}
		
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setClip(clipX, clipY, 50, 50); // Ŭ���� ���� ����, Ŭ���� ���� ũ�� 50x50
			g.drawImage(img,0,0,getWidth(), getHeight(), this); // ��� �̹����� �г� ��ü�� �׸���
			g.drawString("�ڹ�",40,340); // ���ڿ� "�ڹ�" �׸���			
		}
		
		class MyKeyListener extends KeyAdapter {
			@Override
			public void keyPressed(KeyEvent e) {
				// ��, ��, ��, �� Ű��  �����ڵ� Ű�� �ƴϹǷ� getKeyCode()�� Ű ���� �˾Ƴ���.
				switch(e.getKeyCode()) { 
					case KeyEvent.VK_UP : 
						clipY -=10;
						if(clipY < 0) // Ŭ�� ������ �г� ���� �Ѿ ��
							clipY = 0;
						break; // UP Ű�̸� Ŭ���� ���� ���� �̵� 
					case KeyEvent.VK_DOWN :
						clipY += 10; 
						if(clipY > getHeight()) // Ŭ�� ������ �г� �Ʒ������� �Ѿ ��
							clipY -= 10; // ���� ����
						break; // DOWN Ű�̸� Ŭ���� ���� �Ʒ��� �̵�
					case KeyEvent.VK_LEFT : 
						clipX -=10;
						if(clipX < 0) // Ŭ�� ������ �г� �������� �Ѿ ��
							clipX = 0;
						break; // LEFT Ű�̸�  Ŭ���� ���� �������� �̵�
					case KeyEvent.VK_RIGHT :
						clipX += 10;
						if(clipX> getWidth()) // Ŭ�� ������ �г� ���������� �Ѿ ��
							clipX -= 10; // ���� ����						
						break; // RIGHT Ű�̸�   Ŭ���� ���� ���������� �̵� 
				}
				repaint(); // Ŭ���� ������ ����Ǿ����Ƿ� �г� �ٽ� �׸���(�߿���)
			}
		}
	}
	public static void main(String[] args) {
		new OpenChallenge_12();
	}
}