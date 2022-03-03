package CHAPTER07;

// 클래스의 정의
class A1 {
	A1(){
		System.out.println("첫 번째 생성자");
	}
	A1(int a){
		this();
		System.out.println("두 번째 생성자");
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
		// 객체 생성
		A1 a1 = new A1();
		System.out.println();
		A1 a2 = new A1(3);
	}

}
