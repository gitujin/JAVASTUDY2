package CHAPTER07;

// Ŭ���� ���� 
class Aa{
	int m = 3;
	int n = 4;
	void work1() {
		int k = 5;
		System.out.println(k);
		work2(3);
	}
	void work2(int i) {
		int j = 4;
		System.out.println(i + j);
	}
}

public class FieldComponent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ŭ������ ��ü ���� 
		Aa a = new Aa();
		//�ʵ尪 ���
		System.out.println(a.m);
		System.out.println(a.n);
		//�޼��� ȣ��
		a.work1(); //work1() �ȿ� ���ǵ� ���� ������ ���� �޸𸮿� �߰�
	}

}
