import java.util.Scanner;

public class A208 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = sc.next();
		
		String replaceString=a.replaceAll("WUB"," ").trim();
		System.out.println(replaceString);
	}

}
