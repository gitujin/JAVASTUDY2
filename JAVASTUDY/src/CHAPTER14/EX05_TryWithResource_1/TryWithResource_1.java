package CHAPTER14.EX05_TryWithResource_1;

import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���ڸ� �Է��ϼ���!");
		
		// System.in ���ҽ��� �����ϸ� �� �̻� �ܼ� �Է� �Ұ�
		// 1. ���ҽ� �ڵ� ����
		try(InputStreamReader isr1 = new InputStreamReader(System.in);){
			char input = (char)isr1.read();
			System.out.println("�Է� ���� = " + input);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		//2. ���ҽ� ���� ����
		InputStreamReader isr2 = null;
		try {
			isr2 = new InputStreamReader(System.in);
			char input = (char)isr2.read();
			System.out.println("�Է� ����  = " + input);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			//���ҽ� ���� ����
			if(isr2 != null) {
				try {
					isr2.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
