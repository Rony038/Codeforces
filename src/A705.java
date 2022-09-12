import java.util.Scanner;

public class A705 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = sc.nextInt();
		
		for(int i=1;i<n;i++)
		{
			if(i%2!=0) {
				System.out.print("I hate that ");
			}
			if(i%2==0) {
				System.out.print("I love that ");
			}
		}
		if(n%2==0) {
			System.out.println("I love it");
		}
		if(n%2!=0) {
			System.out.println("I hate it");
		}
		
	}

}
