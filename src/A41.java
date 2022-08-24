import java.util.Scanner;

public class A41 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = sc.next();
		String t = sc.next();
		String s1 = "";
		//char[] charArr = new char[s.length()];
		//char[] charArray = s.toCharArray();
		for(int i=s.length()-1; i>=0; i--) {
			s1 = s1+s.charAt(i);
		}
		//System.out.println(s1);
		if(s1.equals(t)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
