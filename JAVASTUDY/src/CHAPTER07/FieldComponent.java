package CHAPTER07;

// 클래스 생성 
class Aa{
	int m = 3;
	int n = 4;
	void work1() {
		int k = 5;
		System.out.println(k);
		work2(3);
	}
	void work2(int i) {
		int j = 4;
		System.out.println(i + j);
	}
}

public class FieldComponent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//클래스로 객체 생성 
		Aa a = new Aa();
		//필드값 출력
		System.out.println(a.m);
		System.out.println(a.n);
		//메서드 호출
		a.work1(); //work1() 안에 정의된 지역 변수를 스택 메모리에 추가
	}

}
