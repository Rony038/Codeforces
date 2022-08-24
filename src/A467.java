import java.util.Scanner;

public class A467 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = sc.nextInt();
		int[] p = new int[n];
		int[] q = new int[n];
		int count=0;
		for(int i=0; i<n; i++) {
			p[i] = sc.nextInt();
			q[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			if(q[i]-p[i]>=2) {
				count++;
			}
		}
		System.out.println(count);
	}

}
