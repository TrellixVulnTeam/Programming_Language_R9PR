package chapter04;

public class Ex04 {
	String title;
	String author;
	
	public Ex04(String t) {
		title = t;
		author = "���ڹ̻�";
	}
	
	public Ex04(String t, String a) {
		title = t;
		author = a;
	}
	
	public static void main(String[] args) {
		Ex04 littlePrince = new Ex04("�����", "�������丮");
		
		Ex04 loveStory = new Ex04("������");
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}
}
