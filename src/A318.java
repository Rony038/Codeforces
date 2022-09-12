import java.util.ArrayList;
import java.util.Scanner;

public class A318 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Long n = sc.nextLong();
		long k = sc.nextLong();
		//long a[] = new long[n];
		/*ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=1; i<=n; i++) {
			if(i%2!=0) {
				a.add(i);
			}
		}
		for(int i=2; i<=n; i++) {
			if(i%2==0) {
				a.add(i);
			}
		}
		System.out.println(a.get((int) (k-1)));*/
		
	

		if(k<=(n+1)/2)
		{
			long rem=((2*k)-1);
			System.out.println(rem);
		}

		else 
		{
			long rem=(k-((n+1)/2))*2;
			/*if ((n+1)%2==1)
				rem++;*/
			
			System.out.println(rem);
		}
		
	}

}
