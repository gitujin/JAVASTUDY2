package CHAPTER07;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();
		print(3);
		print(5.8);
		print(2, 5);
	}
	
	public static void print() {
		System.out.println("�����Ͱ� �����ϴ�.");
	}
	public static void print(int a) {
		System.out.println(a);
	}
	public static void print(double a) {
		System.out.println(a);
	}
	/*
	public static void print(double b){
		System.out.println(b);
	}
	 */
	public static void print(int a, int b) {
		System.out.println("a : "+ a + "b: " + b);
	}
	/*
	 public static int print(int a, int b){
	 	System.out.println("a: " + a + "b :" + b);
	 	return a+b;
	 }
	 */
}
