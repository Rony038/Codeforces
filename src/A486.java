import java.util.Scanner;

public class A486 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long n = sc.nextLong();
		/*int sum = 0;
		for(int i=1; i<=n; i++) {
			if(i%2==0) {
				sum = sum +i;
			}
			else {
				sum = sum -i ;
			}
		}
		System.out.println(sum);
		*/
		
		if(n%2==0) {
			System.out.println(n/2);
		}else {
			System.out.println(-(n/2+1));
		}
		
	}

}
