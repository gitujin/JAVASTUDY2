package CHAPTER09_1;

import CHAPTER09.A; //CHAPTER09의 클래스 A 임포트

public class C {
	public void print() {
		//객체 생성
		A a = new A();
		
		//멤버 활용
		System.out.print(a.a+" ");
		//System.out.print(a.b+" "); //다른 패키지 내의 클래스에서는 자식 클래스가 아닐 때 public 접근 지정자만 사용가능
		//System.out.print(a.c+" ");
		//System.out.print(a.d+" ");
		System.out.println();
	}
}
