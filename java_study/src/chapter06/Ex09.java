package chapter06;
import java.util.StringTokenizer;

public class Ex09 {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("ȫ�浿/��ȭ/ȫ��/����/����", "/");
		
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}

	}

}
