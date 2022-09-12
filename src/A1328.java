import java.util.Scanner;

public class A1328 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = sc.nextInt();
		int[] a = new int[t];
		int[] b = new int[t];
		int count=0, result, reminder, f_r;
		for(int i=0; i<t; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		for(int i=0; i<t; i++) {
			if(a[i]%b[i]!=0) {
				result = (a[i]+b[i])-(a[i]%b[i]);
				f_r = result - a[i];
				System.out.println(f_r);
			}
			else {
				System.out.println(count);
			}
			
		}
		
	}

}
