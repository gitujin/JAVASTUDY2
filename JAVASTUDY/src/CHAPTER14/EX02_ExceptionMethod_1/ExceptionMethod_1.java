package CHAPTER14.EX02_ExceptionMethod_1;

public class ExceptionMethod_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. ���� ��ü�� �������� �� �޽����� �������� �ʾ��� ���
		 try {
			 throw new Exception();
		 }catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
		 
		 //2. ���� ��ü�� �������� �� �޽����� �������� ���
		 try {
			 throw new Exception("���� �޽���");
		 } catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
	}

}
