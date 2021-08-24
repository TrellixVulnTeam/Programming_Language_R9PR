package chapter11;
import javax.swing.*;
import java.awt.*;

public class Ex06 extends JFrame {
	public Ex06() {
		setTitle("������ư ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("images/image0.jpg");
		
		ImageIcon selectedCherryIcon = new ImageIcon("images/image2.jpg");
		
		ButtonGroup g = new ButtonGroup();
		
		JRadioButton apple = new JRadioButton("���");
		JRadioButton pear = new JRadioButton("��", true);
		JRadioButton cherry = new JRadioButton("ü��", cherryIcon);
		
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherryIcon);
		
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(250,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex06();

	}

}
