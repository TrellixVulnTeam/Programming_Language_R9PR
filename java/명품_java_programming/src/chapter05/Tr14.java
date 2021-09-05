package chapter05;

interface Shape {
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("--- �ٽ� �׸��ϴ�. ");
		draw();
	}
}

class Circle implements Shape {
	private int r;
	public Circle(int r) {
		this.r = r;
	}
	public void draw() {
		System.out.println("�������� " + r + "�� ���Դϴ�.");
	}
	public double getArea() {
		return PI*r*r;
	}
}

class Oval implements Shape {
	private int i, j;
	public Oval(int i, int j) {
		this.i = i;
		this.j = j;
	}
	public void draw() {
		System.out.println(i + "x" + j +"�� �����ϴ� Ÿ���Դϴ�.");
	}
	public double getArea() {
		return PI*i*j;
	}
}

class Rect implements Shape {
	private int i, j;
	public Rect(int i, int j) {
		this.i = i;
		this.j = j;
	}
	public void draw() {
		System.out.println(i + "x" + j +"ũ���� �簢�� �Դϴ�.");
	}
	public double getArea() {
		return i*j;
	}
}

public class Tr14 {

	public static void main(String[] args) {
		Shape [] list = new Shape[3];
		list[0] = new Circle(10);
		list[1] = new Oval(20, 30);
		list[2] = new Rect(10, 40);
		
		for(int i=0; i<list.length; i++) list[i].redraw();
		for(int i=0; i<list.length; i++) System.out.println("������ " + list[i].getArea());
	}

}
