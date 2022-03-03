package CHAPTER07;

//클래스 생성(정의)
class Ad{
	boolean m1;
	int m2;
	double m3;
	String m4;
	void printFieldValue() {
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
	}
	void printLocalVariable() {
		int k;
		//System.out.println(k); //지역 변수를 초기화하지 않아 오류 발생 
	}
}

public class InitialValueOfFieldAndLocalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 클래스를 활용해 객체 생성
		Ad a = new Ad();
		// 객체 활용
		a.printFieldValue();
	}

}
