import java.util.Scanner;

public class B266 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		int t = sc.nextInt();
		String s = sc.next();
		char charArray[] = s.toCharArray();
		
		for(int i=0; i<t; i++) {
			for(int j=0; j<charArray.length-1; j++) {
				if(charArray[j]=='B' && charArray[j+1]=='G') {
					charArray[j]='G';
					charArray[j+1]='B';
					j++;
				}
			}
		}
		System.out.println(charArray);
		
	}

}
