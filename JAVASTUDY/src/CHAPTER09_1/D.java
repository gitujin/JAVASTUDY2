package CHAPTER09_1;

import CHAPTER09.A;

public class D extends A{ //D 클래스는 A 클래스의 자식 클래스
	public void print() {
		//멤버 활용
		System.out.print(a + " ");
		System.out.print(b + " ");
		//System.out.println(c + " ");
		//System.out.println(d + " ");
		System.out.println();
	}
}
