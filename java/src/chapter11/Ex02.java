package chapter11;
import javax.swing.*;
import java.awt.*;

public class Ex02 extends JFrame {
	public Ex02() {
		setTitle("���̺� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("����մϴ�.");
		
		ImageIcon beauty = new ImageIcon("images/image0.jpg");
		JLabel imageLabel = new JLabel(beauty);
		
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
		JLabel label = new JLabel("��������� ��ȭ�ϼ���", normalIcon, SwingConstants.CENTER);
		
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
		
		setSize(300,600);
		setVisible(true);		
		
	}

	public static void main(String[] args) {
		new Ex02();

	}

}
