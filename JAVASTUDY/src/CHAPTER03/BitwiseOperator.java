package CHAPTER03;

public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자바 메서드로 진법 변환
		int data = 13;
		System.out.println(Integer.toBinaryString(data));
		System.out.println(Integer.toOctalString(data));
		System.out.println(Integer.toHexString(data));
		System.out.println();
		
		System.out.println(Integer.parseInt("1101",2));
		System.out.println(Integer.parseInt("15",8));
		System.out.println(Integer.parseInt("0D",16));
		System.out.println();
		
		//다양한 진법 표현
		System.out.println(13);
		System.out.println(0b1101);
		System.out.println(015);
		System.out.println(0x0D);
		System.out.println();
		
		System.out.println(3&10);
		System.out.println(0b0011 & 0x0A);
		System.out.println(0x03 & 0x0A);
		System.out.println();
		
		System.out.println(3|10);
		System.out.println(0b0011|0b1010);
		System.out.println(0x03 | 0x0A);
		System.out.println();
		
		System.out.println(3^10);
		System.out.println(0b0011 ^ 0b1010);
		System.out.println(0x03 ^ 0x0A);
		System.out.println();
		
		System.out.println(~3);
		System.out.println(~0b0011);
		System.out.println(~0x03);
	}

}
