import java.util.Scanner;

public class A977 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		int k = sc.nextInt();
		for(int i =1; i<=k; i++) {
			if(n%10==0) {
				n = n/10;
			}
			else {
				n = n-1;
			}
			//System.out.println(n);
		}
		System.out.println(n);
	}

}
