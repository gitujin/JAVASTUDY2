package CHAPTER07;

import java.util.Arrays;

public class ArrayArgumentMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �迭�� �Է¸Ű������� �ϴ� �޼��� ȣ��
		int[] a = new int[]{1, 2, 3};
		printArray(a);
		printArray(new int[] {1, 2, 3});
		//printArray({1, 2, 3});
	}
	public static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}

}
