package CHAPTER11.EX01_AbstractModifier_1;

class Animal{
	void cry() {}
}
class Cat extends Animal{
	void cry() {
		System.out.println("具克");
	}
}
class Dog extends Animal{
	void cry() {
		System.out.println("港港");
	}
}

public class AbstractModifier_1 {

	public static void main(String[] args) {
		// 按眉 积己
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();

		// 皋辑靛 龋免
		animal1.cry();
		animal2.cry();
	}

}
