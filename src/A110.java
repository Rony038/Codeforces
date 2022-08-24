import java.util.Scanner;

public class A110 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n = sc.next();
		int count=0;
		//String s = String.valueOf(n);
		//char[] charArray = s.toCharArray();
		for(int i=0; i<n.length(); i++) {
			if(n.charAt(i)=='4' || n.charAt(i)=='7') {
				++count;
				
			}
		}
		//System.out.println(count);
		if(count==7 || count==4) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
