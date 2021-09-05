package chapter14;
import javax.swing.*;
import java.awt.*;

public class Ex05 extends JFrame {
	public Ex05() {
		setTitle("���� ���� �ð� ���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel cherryLabel = new JLabel(new ImageIcon("images/image0.jpg"));
		cherryLabel.setToolTipText("ü�� �̹��� ���");
		
		JLabel appleLabel = new JLabel(new ImageIcon("images/image1.jpg"));
		appleLabel.setToolTipText("��� �̹��� ���");
		
		c.add(cherryLabel);
		c.add(appleLabel);
		
		ToolTipManager m = ToolTipManager.sharedInstance();
		m.setInitialDelay(0);
		m.setDismissDelay(10000);
		
		setSize(400,220);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex05();

	}

}
