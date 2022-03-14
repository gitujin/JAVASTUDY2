package CHAPTER10.OverlapInstanceField;

class AA {
	static void print() {
		System.out.println("A 클래스");
	}
}
class BB extends AA {
	static void print() {
		System.out.println("B 클래스");
	}
}

public class OverlapStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 클래스명으로 바로 접근
		AA.print();
		BB.print();
		System.out.println();
		
		// 객체 생성
		AA aa = new AA();
		BB bb = new BB();
		AA ab = new BB();
		
		//객체를 통한 메서드 호출
		aa.print();
		bb.print();
		ab.print();
	}

}
