package CHAPTER04;

public class DoWhileControlStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		a = 0;
		while (a < 0) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		a = 0;
		do {
			System.out.print(a + " ");
			a++;
		}while(a<0);
		System.out.println();
		
		//�ݺ� Ƚ���� 1�� �� do-while�� ��
		a = 0;
		while(a < 1) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		a = 0;
		do {
			System.out.print(a + " ");
			a++;
		}while(a<1);
		System.out.println();
		
		//�ݺ� Ƚ���� 10�� �� do-while ���� while �� ��
		a = 0;
		while(a<10) {
			System.out.println(a + " ");
			a++;
		}while(a < 10);
	}

}
