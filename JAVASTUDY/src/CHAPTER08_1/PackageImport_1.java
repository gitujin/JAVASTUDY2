package CHAPTER08_1;

public class PackageImport_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ü ����
		//A a = new A(); //����
		CHAPTER08.A a = new CHAPTER08.A();
		
		//��� Ȱ��
		System.out.println(a.m);
		System.out.println(a.n);
		a.print();
	}

}
