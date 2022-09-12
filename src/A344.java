import java.util.Scanner;

public class A344 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		int a[] = new int[n];
		int count=0;
		int p = 00; 
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			if(a[i]!=p) {
				p= a[i];
				count++;
				
			}
			else {
				continue;
			}
		}
		System.out.println(count);

	}

}
