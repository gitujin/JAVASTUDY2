package CHAPTER07;

public class FlexibleSizeArrayArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method1(int...values)
		method1(1,2);
		method1(1,2,3);
		method1();
		//method2(String...values)
		method2("�ȳ�","�氡");
		method2("��ť", "����", "����");
		method2();
	}
	public static void method1(int...values) {
		System.out.println("�迭�� ����: " + values.length);
		/* �迭 ��� ��� 1
		 for(int i = 0; i < values.length; i++){
		 	System.out.println(values[i] + " ");
		 }
		 */
		// �迭 ��� ��� 2
		for(int k: values) {
			System.out.print(k+ " ");
		}
		/* �迭 ��� ��� 3
		 System.out.println(Arrays.toString(values)); 
		 */
		System.out.println();
	}
	public static void method2(String...values) {
		System.out.println("�迭�� ����: " + values.length);
		/* �迭 ��� ���1
		 for(int i = 0; i < values.length; i++){
		 	System.out.print(values[i] + " ");
		 }
		 */
		//�迭 ��� ��� 2
		for(String k : values) {
			System.out.print(k + " ");
		}
		/* �迭 ��� ��� 3
		 System.out.println(Arrays.toString(values));
		 */
		System.out.println();
	}

}
