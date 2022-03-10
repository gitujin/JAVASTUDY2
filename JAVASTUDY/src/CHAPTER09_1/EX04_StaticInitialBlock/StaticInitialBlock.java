package CHAPTER09_1.EX04_StaticInitialBlock;

class A{
	int a;
	static int b;
	static {
		b = 5; // 정적 필드의 초기화는 static {} 내에서 수행
		System.out.println("클래스 A가 로딩됐습니다!!");
	}
	A(){
		a = 3;
	}
}

public class StaticInitialBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(A.b);
	}

}
