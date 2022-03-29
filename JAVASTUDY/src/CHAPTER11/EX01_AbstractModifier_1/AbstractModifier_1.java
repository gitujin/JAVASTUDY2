package CHAPTER11.EX01_AbstractModifier_1;

class Animal{
	void cry() {}
}
class Cat extends Animal{
	void cry() {
		System.out.println("�߿�");
	}
}
class Dog extends Animal{
	void cry() {
		System.out.println("�۸�");
	}
}

public class AbstractModifier_1 {

	public static void main(String[] args) {
		// ��ü ����
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();

		// �޼��� ȣ��
		animal1.cry();
		animal2.cry();
	}

}
