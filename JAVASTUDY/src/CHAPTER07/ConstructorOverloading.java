package CHAPTER07;

class Ab{
	Ab(){
		System.out.println("첫 번째 생성자");
	}
	Ab(int a){
		System.out.println("두 번째 생성자");
	}
	Ab(int a, int b){
		System.out.println("세 번째 생성자");
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
