package chapter04;

public class Ex05 {
	String title;
	String author;
	
	void show() { System.out.println(title + " " + author); }
	
	public Ex05() {
		this("", "");
		System.out.println("������ ȣ���");
	}
	
	public Ex05(String title) {
		this(title, "���ڹ̻�");
	}
	
	public Ex05(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public static void main(String[] args) {
		//Ex05 littlePrince = new Ex05("�����", "�������丮");
		Ex05 loveStory = new Ex05("������");
		//Ex05 emptyBook = new Ex05();
		loveStory.show();
	}
}
