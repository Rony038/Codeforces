import java.util.Scanner;

public class A281 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = sc.next();
		String firstChar = s1.substring(0, 1).toUpperCase();
		String restChar = s1.substring(1, s1.length());
		
		s1 = firstChar+restChar;
		
		System.out.println(s1);
		
	}

}
