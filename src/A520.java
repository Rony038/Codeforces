
import java.util.Scanner;

public class A520 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc.nextInt();
		String s = sc.next();
		int k =0;
		for(char ch='a'; ch<='z';ch++ ) {
			if(s.toLowerCase().contains(String.valueOf(ch))) {
				k++;
			}
		}
		
		if(k>=26) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
	}

}
