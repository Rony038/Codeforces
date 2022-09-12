import java.util.Arrays;
import java.util.Scanner;

public class A405 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		for(int i=0; i<n; i++) {
			System.out.println(a[i]);
		}

	}

}
