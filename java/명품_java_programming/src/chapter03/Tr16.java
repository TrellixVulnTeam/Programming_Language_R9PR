package chapter03;
import java.util.Scanner;

public class Tr16 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str[] = {"����", "����", "��"};
		
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		while (true) {
			System.out.print("���� ���� ��!>>");
			String i = scanner.next();
			if (i.equals("�׸�"))
				break;
			
			int n = (int)(Math.random()*3);
			if (str[n].equals("����")) {
				if (i.equals("����"))
					System.out.println("����� = " + i + ", ��ǻ�� = " + str[n] + ", �����ϴ�.");
				else if (i.equals("����"))
					System.out.println("����� = " + i + ", ��ǻ�� = " + str[n] + ", ����ڰ� �̰���ϴ�.");
				else if (i.equals("��"))
					System.out.println("����� = " + i + ", ��ǻ�� = " + str[n] + ", ����ڰ� �����ϴ�.");
			}
			else if (str[n].equals("����")) {
				if (i.equals("����"))
					System.out.println("����� = " + i + ", ��ǻ�� = " + str[n] + ", �����ϴ�.");
				else if (i.equals("��"))
					System.out.println("����� = " + i + ", ��ǻ�� = " + str[n] + ", ����ڰ� �̰���ϴ�.");
				else if (i.equals("����"))
					System.out.println("����� = " + i + ", ��ǻ�� = " + str[n] + ", ����ڰ� �����ϴ�.");
			}
			else if (str[n].equals("��")) {
				if (i.equals("��"))
					System.out.println("����� = " + i + ", ��ǻ�� = " + str[n] + ", �����ϴ�.");
				else if (i.equals("����"))
					System.out.println("����� = " + i + ", ��ǻ�� = " + str[n] + ", ����ڰ� �̰���ϴ�.");
				else if (i.equals("����"))
					System.out.println("����� = " + i + ", ��ǻ�� = " + str[n] + ", ����ڰ� �����ϴ�.");
			}
		}
		scanner.close();
	}

}