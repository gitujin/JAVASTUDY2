package CHAPTER05;

public class ArgumentOfMainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//args �迭�� ���� ���ϱ�
		System.out.println(args.length);
		System.out.println();
		
		//�Է� �Ű����� ���1
		for(int i = 0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println();
		
		//�Է� �Ű����� ���2
		for(String s: args) {
			System.out.println(s);
		}
		System.out.println();
	}

}
