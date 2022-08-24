import java.util.Scanner;

public class A112 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a, b, s1, s2;
		a = sc.next();
		b = sc.next();
		s1 = a.toLowerCase();
		s2 = b.toLowerCase();
		
		if(s1.compareTo(s2)==0) {
			System.out.println("0");
		}
		else if(s1.compareTo(s2)>0) {
			System.out.println("1");
		}
		else {
			System.out.println("-1");
		}

	}

}
