package CHAPTER05;

public class ValueAssingment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열의 값 대입 방법 1
		int[] array1 = new int[3];
		array1[0] = 3;
		array1[1] = 4;
		array1[2] = 5;
		System.out.println(array1[0] + " " + array1[1] + " " + array1[2]);
		
		int[] array2;
		array2 = new int[3];
		array2[0] = 3;
		array2[1] = 2;
		array2[2] = 1;
		System.out.println(array2[0] + " " + array2[1] + " " + array2[2]);
		
		//배열의 값 대입 방법2
		int[] array3 = new int[] {3,4,5};
		System.out.println(array3[0] + " " + array3[1] + " " + array3[2]);
		
		int[] array4;
		array4 = new int[] {3,4,5}; //배열의 선언과 객체 대입을 분리 가능
		System.out.println(array4[0] + " " + array4[1] + " " + array4[2]);
		
		//배열의 값 대입 방법3
		int[] array5 = {3, 4, 5}; //강제 초기화 생략
		System.out.println(array5[0] + " " + array5[1] + " " + array5[2]);
		
		//int[] array6;            배열의 선언과 객체 대입을 분리 불가능
		//array6 = {3, 4, 5};
		//System.out.println(array6[0] + " " + array6[1] + " " + array6[2]);
	}
}
