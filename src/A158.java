import java.util.Scanner;

public class A158 {

		static Scanner sc = new Scanner(System.in);
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int n, k,b, count=0, minscore=0;
			n = sc.nextInt();
			k = sc.nextInt();
			int[] a = new int[n+1];
			for(int i=1; i<=n; i++) {
				b = sc.nextInt();
				a[i] = b;
				if(i==k) {
					minscore = b;
				}
			}
			
			for(int j=1; j<=n; j++) {
				if(a[j]>=minscore && a[j]>0) {
					count++;
				}
			}
			System.out.println(count);
			
	 
		}

}
