package CHAPTER02;

public class NamingVariableAndConstant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수
		boolean aBcD; //대문자는 새로운 단어의 앞 글자에 사용 권장
		byte 가나다; //한글로 작성 가능하지만 권장 X
		short _abcd; 
		char $ab_cd;
		//int 3abcd; //숫자는 이름 맨 앞에X
		long abcd3; 
		//float int; //예약어 사용X
		double main;
		//int my work //자바 띄어쓰기X
		String myClassName;
		int ABC; //전부 대문자로 작성가능 하지만 권장 X
		
		//상수
		final double PI;
		final int MY_DATA;
		final float myData; //소문자 사용가능하지만 권장 X
	}

}
