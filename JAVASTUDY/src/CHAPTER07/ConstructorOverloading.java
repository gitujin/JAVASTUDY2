package CHAPTER07;

class Ab{
	Ab(){
		System.out.println("ù ��° ������");
	}
	Ab(int a){
		System.out.println("�� ��° ������");
	}
	Ab(int a, int b){
		System.out.println("�� ��° ������");
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ab a1 = new Ab();
		Ab a2 = new Ab(3);
		Ab a3 = new Ab(3, 5);
	}

}
