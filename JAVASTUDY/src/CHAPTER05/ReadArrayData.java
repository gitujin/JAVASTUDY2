package CHAPTER05;

import java.util.Arrays;

public class ReadArrayData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {3, 4, 5, 6, 7};
		
		//�迭�� ���� ���ϱ�
		System.out.println(array.length);
		
		//����ϱ�1
		System.out.println(array[0] + " ");
		System.out.println(array[1] + " ");
		System.out.println(array[2] + " ");
		System.out.println(array[3] + " ");
		System.out.println(array[4] + " ");
		System.out.println();
		
		//����ϱ� 2
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
		System.out.println();
		
		//����ϱ� 3
		for(int k: array) {
			System.out.println(k + "");
		}
		System.out.println();
		
		//����ϱ� 4
		System.out.println(Arrays.toString(array)); //Arrays Ŭ������ toString() �޼��� ���
	}

}
