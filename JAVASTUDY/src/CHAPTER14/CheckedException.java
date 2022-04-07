package CHAPTER14;

import java.io.InputStreamReader;

class A implements Cloneable{
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class CheckedException {

	public static void main(String[] args) {

		// 1. InterruptedExcption
		Thread.sleep(1000);
		
		// 2. ClassNotFoundException
		Class cls = Class.forName("java.lang.Object");
		
		// 3. IOException
		InputStreamReader in = new InputStreamReader(System.in);
		in.read();
		
		// 4. FileNotFoundException
		FileInputStream fis = new FileInputStream("text.txt");
		
		// 5. CloneNotSuppertedException
		A a1 = new A();
		A a2 = new (A)a1.clone();
	}

}
