package CHAPTER07;

// 클래스 내부에서 필드, 메서드 앞에 붙는 자동으로 붙는 this 키워드
class Ae {
	int m;
	int n;
	void init(int a, int b) {
		int c;
		c = 3;
		this.m = a;
		this.n = b;
	}
	void work() {
		this.init(2, 3);
	}
}

public class ThisKeyword_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 클래스 객체 생성
		Ae a = new Ae();
		a.work();
		System.out.println(a.m);
		System.out.println(a.n);
	}

}
