import java.util.Scanner;

public class A58 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = sc.next();
		char[] charArray = s.toCharArray();
		String s1 = "hello";
		char[] charArr = s1.toCharArray();
		int x=0, y=0;
		
		for(int i=0; i<=s.length()-1; i++) {
			if(charArray[i]==charArr[x]) {
				x++;
				y++;
				if(y==5) {
					break;
				}
			}
		}
		if(y==5) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
