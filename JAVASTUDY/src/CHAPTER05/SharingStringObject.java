package CHAPTER05;

public class SharingStringObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("¾È³ç");
		String str2 = "¾È³ç";
		String str3 = "¾È³ç"; //str2¸¦ °¡¸®Å°´Â °´Ã¼¸¦ °øÀ¯
		String str4 = new String("¾È³ç"); // »õ °´Ã¼ »ý¼º 
		
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str3 == str4);
		System.out.println(str4 == str1);
	}

}
