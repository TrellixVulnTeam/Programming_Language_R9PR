package chapter04;
import java.util.Scanner;
import java.util.InputMismatchException;

public class WordGameApp_Exam {
	private Scanner scanner;
	private String startWord = "�ƹ���";
	private Player_E[] players; 
	
	public WordGameApp_Exam() {
		scanner = new Scanner(System.in);
	}
	
	public void run() {
		System.out.println("�����ձ� ������ �����մϴ�...");
		
		int nPlayers;
		
		while(true) {
			System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�>>");
			try {
				nPlayers = scanner.nextInt();
				break;
			} catch(InputMismatchException e) {
				System.out.println("������ �Է��ؾ߸� �մϴ�.");
				scanner.nextLine();
				continue;
			}
		}
		
		players = new Player_E[nPlayers];
		
		for(int i=0; i<nPlayers; i++) {
			System.out.print("�������� �̸��� �Է��ϼ���>>");
			String name = scanner.next();
			players[i] = new Player_E(name);
		}
		
		String lastWord = startWord;
		
		System.out.println("�����ϴ� �ܾ�� " + lastWord + "�Դϴ�.");
		int next = 0;
		
		while(true) {
			String newWord = players[next].getWordFromUser();
			
			if(!players[next].checkSuccess(lastWord)) {
				System.out.print(players[next].getName() + "���� ���߽��ϴ�.");
				break;
			}
			next++;
			next %= players.length;
			lastWord = newWord;
		}
	}
	
	public static void main(String[] args) {
		WordGameApp_Exam game = new WordGameApp_Exam();
		game.run();
	}

}

class Player_E {
	private Scanner scanner;
	private String name;
	private String word;
	
	public Player_E(String name) {
		this.name = name;
		scanner = new Scanner(System.in);
	}
	
	public String getName() { return name; }
	
	public String getWordFromUser() {
		System.out.print(name+">>");
		word = scanner.next();
		return word;
	}
	
	public boolean checkSuccess(String lastWord) {
		int lastIndex = lastWord.length()-1;
		
		if(lastWord.charAt(lastIndex) == word.charAt(0))
			return true;
		else
			return false;
	}
}
