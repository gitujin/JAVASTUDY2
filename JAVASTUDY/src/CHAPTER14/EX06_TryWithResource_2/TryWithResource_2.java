package CHAPTER14.EX06_TryWithResource_2;

class A implements AutoCloseable{
	String resource;
	A(String resource){
		this.resource = resource;
	}
	@Override
	public void close()throws Exception{
		if(resource!=null) {
			resource=null;
			System.out.println("���ҽ��� �����ƽ��ϴ�.");
		}
	}
}

public class TryWithResource_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = null;
		try {	
			a1 = new A("Ư�� ����");
		}catch(Exception e) {
			System.out.println("���� ó��");
		}finally {
			//���ҽ� ���� ����
			if(a1.resource!=null) {
				try {
					a1.close();
				}catch(Exception e) {}
			}
		}
	
		// 2. ���ҽ� �ڵ� ����
		try(A a2 = new A("Ư�� ����");){
			}catch (Exception e) {
				System.out.println("���� ó��");
			}
		}
	}
