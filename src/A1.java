import java.util.Scanner;

public class A1 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m, n, a;
		long x, y, sum;
		
		m = sc.nextInt();
		n = sc.nextInt();
		a = sc.nextInt();
		
		x = m/a;
		y = n/a;
		
		if(m%a !=0) {
			x++;
		}
		if(n%a!=0) {
			y++;
		}
		
		sum = x*y;
		
		System.out.println(sum);
	}

}
