package chapter04;

public class Ex01 {
	int radius;
	String name;
	
	public Ex01() { }
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Ex01 pizza;
		pizza = new Ex01();
		pizza.radius = 10;
		pizza.name = "�ڹ�����";
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������ " + area);
		
		Ex01 donut = new Ex01();
		donut.radius = 2;
		donut.name = "�ڹٵ���";
		area = donut.getArea();
		System.out.println(donut.name + "�� ������ " + area);
	}
}