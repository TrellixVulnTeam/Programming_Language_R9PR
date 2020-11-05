package chapter05;
import java.util.Scanner;


abstract class GameObject { // �߻� Ŭ����
	protected int distance; // �� �� �̵� �Ÿ�
	protected int x, y; // ���� ��ġ(ȭ�� �� ���� ��ġ)
	
	public GameObject(int startX, int startY, int distance) { // �ʱ� ��ġ�� �̵� �Ÿ� ����
		this.x = startX; this.y = startY;
		this.distance = distance;
	}
	public int getX() { return x; }
	public int getY() { return y; }
	public boolean collide(GameObject p) { // �� ��ü�� ��ü p�� �浹������ true ����
		if(this.x == p.getX() && this.y == p.getY())
			return true;
		else 
			return false;
	}
	
	protected abstract void move(); // �̵��� ���� ���ο� ��ġ�� x, y ����
	protected abstract char getShape(); // ��ü�� ����� ��Ÿ���� ���� ����
}



class Bear extends GameObject {
	private Scanner scanner;
	public Bear(int x, int y, int distance) {
		super(x, y, distance);
		scanner = new Scanner(System.in);
	}
	
	@Override
	public void move() {
		System.out.print("����(a), �Ʒ�(s), ��(d), ������(f) >> ");
		char c;
		c = scanner.next().charAt(0);
		switch(c) {
			case 'a' : // left
				x--; 
				if(x < 0) x = 0;
				break;
			case 'f' : // right
				x++; 
				if(x >= OpenChallenge_05.MAX_X) x = OpenChallenge_05.MAX_X - 1;
				break;
			case 'd' : // up
				y--; 
				if(y < 0) y = 0;
				break;
			case 's' : // down
				y++; 
				if(y >= OpenChallenge_05.MAX_Y) y = OpenChallenge_05.MAX_Y - 1;
				break;
		}		
	}
	
	@Override
	public char getShape() { // Bear�� ��� ����
		return 'B';
	}
}

class Fish extends GameObject {
	public Fish(int x, int y, int distance) {
		super(x, y, distance); 
	}
	 
	@Override
	public void move() { // �� �� �����̴� ���� ����
		int n = (int)(Math.random()*5); // 0,1,2,3,4 �߿��� 0�� ��� + ����, 1�� ��� - ����, ������ ����
		if(n==0) x += distance;
		else if(n==1) x -= distance;

		if(x < 0) x=0;
		if(x >= OpenChallenge_05.MAX_X) x = OpenChallenge_05.MAX_X - 1;
		 
		n = (int)(Math.random()*5);
		if(n==0) y += distance;
		else if(n==1) y -= distance;

		if(y < 0) y=0;
		if(y >= OpenChallenge_05.MAX_Y) y= OpenChallenge_05.MAX_Y - 1;
	}

	@Override
	public char getShape() { // Fish�� ��� ����
		return '@';
	}
}


public class OpenChallenge_05 {
	public static final int MAX_X = 20;
	public static final int MAX_Y = 10;
	private char map [][] = new char [MAX_Y][MAX_X];
	private GameObject [] m = new GameObject[2];  //m[0] : Bear, m[1] : Fish
	int state; // 0: ���� ��, 1: Monster�� winner, 2:Human�� winner
	
	public OpenChallenge_05() {
		for(int i=0; i<MAX_Y; i++) 
			for(int j=0; j<MAX_X; j++)
				map[i][j] = '-';
		m[0] = new Bear(0, 0, 1);
		m[1] = new Fish(5, 5, 2);
		state = 0; // ���� ��
	}
	public void run() {
		System.out.println("** Bear�� Fish �Ա� ������ �����մϴ�.**");;

		update(); // �ʱ� ��ǥ�� ���� �� ����
		
		draw(); // �ʱ� ���� ���� ������

		while(!doesEnd()) {
			clear(); // ������ �� ����
			for(int i=0; i<m.length; i++) 
				m[i].move();
			update(); // ������ �� ��ǥ ���濡 ���� �� ����
			draw(); // �� �׸���
		}
		System.out.println("Bear Wins!!");;
	}
	private void update() {
		for(int i=m.length-1; i>=0; i--) // Fish���� ���� �׷��� Fish�� �Դ� ��� Fish�� ������ �ʱ�
			map[m[i].getY()][m[i].getX()] = m[i].getShape();
	}
	private void clear() {
		for(int i=0; i<m.length; i++) 
			map[m[i].getY()][m[i].getX()] = '-';
	}
	private void draw() {
		System.out.println();
		for(int i=0; i<MAX_Y; i++) {
			for(int j=0; j<MAX_X; j++)
				System.out.print(map[i][j]);
			System.out.println();
		}
	}
	private boolean doesEnd() {
		if(m[0].collide(m[1])) {// Bear ate Fish
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		OpenChallenge_05  game = new OpenChallenge_05();
		game.run();
	}

}
