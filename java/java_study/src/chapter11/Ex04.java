package chapter11;
import javax.swing.*;
import java.awt.*;

public class Ex04 extends JFrame {
	public Ex04() {
		setTitle("üũ�ڽ� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("images/image0.jpg");
		
		ImageIcon selectedCherryIcon = new ImageIcon("images/image2.jpg");
		
		JCheckBox apple = new JCheckBox("���");
		JCheckBox pear = new JCheckBox("��", true);
		JCheckBox cherry = new JCheckBox("ü��", cherryIcon);
		
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherryIcon);
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(250,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex04();

	}

}
