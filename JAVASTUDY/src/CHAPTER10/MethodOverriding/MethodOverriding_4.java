package CHAPTER10.MethodOverriding;

class AA{
	protected void abc() {}
}
class B1 extends AA{
	public void abc() {}
}
class B2 extends AA{
	protected void abc() {}
}
class B3 extends AA{
	//void abc() {}		//default ���� ������(�������� �Ұ���)
} 
class B4 extends AA{
	//private void abc() {}		//private ���� ������(�������� �Ұ���)
}

public class MethodOverriding_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
