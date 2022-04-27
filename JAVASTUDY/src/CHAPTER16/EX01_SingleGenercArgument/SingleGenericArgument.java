package CHAPTER16.EX01_SingleGenercArgument;

class MyClass<T>{ //제네릭 클래스 정의
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}

public class SingleGenericArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass<String> mc1 = new MyClass<String>(); // 제네릭 타입으로 String 대입 
		mc1.set("안녕"); // T의 제네릭 변수가 String으로 치환
		System.out.println(mc1.get());
		
		MyClass<Integer> mc2 = new MyClass<>(); // Integer타입을 대입
		mc2.set(100); // T의 제네릭 변수가 Integer으로 치환
		System.out.println(mc2.get());
		
//		MyClass<Integer> mc3 = new MyClass<Integer>(); //Integer타입을 제네릭 타입으로 지정했지만
//		mc3.set("안녕"); //String을 대입하여 강한 타입 체크로 문법 오류 발생 
	}

}
