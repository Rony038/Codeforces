import java.util.Scanner;

public class A546 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = sc.nextInt();
		int n = sc.nextInt();
		int w = sc.nextInt();
		int total=0, borrow=0;
		for(int i=1; i<=w; i++) {
			total = total + (i*k);
		}
		if(total>n) {
			borrow = total-n;
			System.out.println(borrow);
		}
		else {
			System.out.println(borrow);
		}
		
	}

}
