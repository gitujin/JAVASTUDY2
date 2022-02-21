package CHAPTER03;

public class RelationOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(5<2);
		System.out.println(5>2);
		System.out.println(5<5);
		System.out.println(5<=5);
		System.out.println(5>=5);
		System.out.println();
		
		int a = 5;
		int b = 2;
		int c = 5;
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a==c);
		System.out.println(a!=c);
		System.out.println();
		
		String str1 = new String("¾È³ç");
		String str2 = new String("¾È³ç");
		System.out.println(str1 == str2);
	}

}
