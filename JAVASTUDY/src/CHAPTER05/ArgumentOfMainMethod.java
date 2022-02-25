package CHAPTER05;

public class ArgumentOfMainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//args 배열의 길이 구하기
		System.out.println(args.length);
		System.out.println();
		
		//입력 매개변수 출력1
		for(int i = 0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println();
		
		//입력 매개변수 출력2
		for(String s: args) {
			System.out.println(s);
		}
		System.out.println();
	}

}
