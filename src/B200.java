import java.util.Scanner;

public class B200 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		double sum =0;
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
			sum = sum+a[i];
		}
		System.out.println(sum/n);
	}

}
