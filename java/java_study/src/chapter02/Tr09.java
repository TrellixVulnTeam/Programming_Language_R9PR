package chapter02;
import java.util.Scanner;

public class Tr09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� �߽ɰ� ������ �Է�>>");
		double x1, y1, r = 0;
		x1 = scanner.nextDouble();
		y1 = scanner.nextDouble();
		r = scanner.nextDouble();
		
		System.out.print("�� �Է�>>");
		double x2, y2 = 0;
		x2 = scanner.nextDouble();
		y2 = scanner.nextDouble();
		
		double d = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
		if(d < r)
			System.out.print("�� (" + x2 + ", " + y2 + ")�� �� �ȿ� �ִ�.");
		else
			System.out.print("�� (" + x2 + ", " + y2 + ")�� �� �ۿ� �ִ�.");
		scanner.close();
	}

}
