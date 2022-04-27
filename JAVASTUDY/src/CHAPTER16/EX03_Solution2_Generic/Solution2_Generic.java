package CHAPTER16.EX03_Solution2_Generic;

class Apple{}
class Pencil{}
class Goods<T>{
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}

public class Solution2_Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Goods�� �̿��� Apple ��ü�� �߰��ϰų� ��������
		Goods<Apple> goods1 = new Goods<>();
		goods1.set(new Apple());
		Apple apple = goods1.get(); // �ٿ�ĳ���� �ʿ� ����
		
		// 2. Goods�� �̿��� Pencil ��ü�� �߰��ϰų� ��������
		Goods<Pencil> goods2 = new Goods<>();
		goods2.set(new Pencil());
		Pencil pencil = goods2.get();
		
		// 3. �߸��� Ÿ�� ����
		Goods<Apple> goods3 = new Goods<>();
		goods3.set(new Apple());
		// Pencil pencil2 = goods3.get();
	}

}
