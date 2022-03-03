package CHAPTER07;

class Az{
	int m;
	int n;
	void init(int m, int n) {
		m = m;
		n = n;
	}
}

class Bb{
	int m;
	int n;
	void init(int m, int n) {
		this.m = m;
		this.n = n;
	}
}

public class ThisKeyword_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Az a = new Az();
		a.init(2,3);
		System.out.println(a.m);
		System.out.println(a.n);
		
		// 필드명과 지역 변수명이 같고, this 키워드를 사용함
		Bb b = new Bb();
		b.init(2, 3);
		System.out.println(b.m);
		System.out.println(b.n);
	}

}
