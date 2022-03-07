package CHAPTER08_1;

class A{
	int m = 3;
	int n = 4;
	
	void print() {
		System.out.println(m + ", " + n);
	}
}

public class ExternalClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.print();
	}

}
