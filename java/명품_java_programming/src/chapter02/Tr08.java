package chapter02;
import java.util.Scanner;

public class Tr08 {

	public static boolean inRect(int x, int y) {
	   if((x >= 100 && x <= 200) && (y >= 100 && y <= 200))
	         return true;
	      else
	         return false;
	   }
	   
	public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	           
	   System.out.print("(x1, y1) �� ���� �Է��� �ּ���>>");
	   int x1, y1 = 0;
	   x1 = scanner.nextInt();
	   y1 = scanner.nextInt();
	   System.out.print("(x2, y2) �� ���� �Է��� �ּ���>>");
	   int x2, y2 = 0;
	   x2 = scanner.nextInt();
	   y2 = scanner.nextInt();
	   
	   boolean a, b;   
	   a = inRect(x1,y1);
	   b = inRect(x2,y2);
	      
	   if(a == true || b == true) {
	       System.out.print("�� �簢���� �浹");
	    }
	    else {
	       System.out.print("�� �簢���� �浹X");
	    }
	     scanner.close();
	}

}
