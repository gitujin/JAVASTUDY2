package CHAPTER04;

public class ForControlStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for�� �⺻ ���� ����
		int a;
		for(a = 0; a < 3; a++) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		for(int i = 0; i < 3; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i = 0; i < 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i = 0; i >0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i = 0; i < 10; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i = 0, j = 0; i<10; i++,j++) {
			System.out.print(i+j+" ");
		}
		System.out.println();
		
		//for���� Ư���� ����(���� ����)
		/*
		 for(int i = 0; ; i++){
		 	System.out.println(i + " ");
		 }
		 for(;;){
		 	System.out.println("���� ����");
		 }
		 */
		System.out.println();
		
		//���� ���� Ż��
		for(int i = 0; ; i++) {
			if(i > 10) {
				break;
			}
			System.out.println(i + " ");
		}
		System.out.print("���� ���� Ż��");
	}

}
