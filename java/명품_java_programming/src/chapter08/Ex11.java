package chapter08;
import java.io.*;

public class Ex11 {

	public static void main(String[] args) {
		File src = new File("C:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg");
		
		File dest = new File("c:\\Temp\\copyimg.jpg");
		
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			byte [] buf = new byte [1024*10];
			
			while(true) {
				int n = fi.read(buf);
				fo.write(buf, 0, n);
				if(n < buf.length)
					break;
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "�� " + dest.getPath() + "�� �����Ͽ����ϴ�.");
		} catch (IOException e) {
			System.out.println("���� ���� ����");
		}

	}

}
