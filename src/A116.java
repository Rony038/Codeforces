import java.util.Scanner;

public class A116 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		int a, b;
		int sum=0, k=0;
		for(int i=0; i<n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			sum = (a+k)-b; 
			if(sum < 0)
	            k = 0;
	        else
	            k = sum;	
		}
		System.out.println(sum);
	}

}
