package CHAPTER07;

// Ŭ������ ����
class A1 {
	A1(){
		System.out.println("ù ��° ������");
	}
	A1(int a){
		this();
		System.out.println("�� ��° ������");
	}
	/*
	 void abc(){
	 	this();
	 }
	 */
}

public class ThisMethod_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ü ����
		A1 a1 = new A1();
		System.out.println();
		A1 a2 = new A1(3);
	}

}
