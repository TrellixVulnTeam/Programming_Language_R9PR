package chapter05;

abstract class PairMap {
	protected String keyArray [];
	protected String valueArray [];
	abstract String get(String key);
	abstract void put(String key, String value);
	
	abstract String delete(String key);
	
	abstract int length();
}

class Dictionary extends PairMap {
	private int num;
	public Dictionary(int i) {
		keyArray = new String[i];
		valueArray = new String[i];
		this.num = 0;
	}
	
	@Override
	public String get(String key) {
		for(int i=0; i<keyArray.length; i++) {
			if(key.equals(keyArray[i])) {
				return valueArray[i];
			}			
		}
		return null;
	}
	@Override
	public void put(String key, String value) {
		for(int i=0; i<keyArray.length; i++) {
			if(key.equals(keyArray[i])) {
				keyArray[i] = key;
				valueArray[i] = value;
			}
		}
		keyArray[num] = key;
		valueArray[num] = value;
		num++;
	}
	@Override
	public String delete(String key) {
		for(int i=0; i<keyArray.length; i++) {
			if(key.equals(keyArray[i])) {
				//String s = valueArray[i];
				keyArray[i] = null;
				valueArray[i] = null;
				//return s;
			}
		}
		return null;	
	}
	@Override
	public int length() {
		return num;
	}
}

public class Tr10 {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̼�");
		dic.put("���繮", "c++");
		System.out.println("���繮�� ���� " + dic.get("���繮"));
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
		dic.delete("Ȳ����");
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
	
	}

}
