import java.util.Arrays;
import java.util.Scanner;

public class A469 {
	
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		int p = sc.nextInt();
		int[] p_a = new int[p];
		int r = 0, s = 0;
		
		
		for(int i =0; i<p; i++) {
			p_a[i] = sc.nextInt();
			/*if(p_a[i]==n) {
				r = p_a[i];
			}*/
		}
		
		
		int q = sc.nextInt();
		int[] q_a = new int[q];
		
		
		for(int i=0;i<q;i++) {
			q_a[i]=sc.nextInt();
			/*if(q_a[i]==n) {
			r = q_a[i];
		}*/
		}
		for(int j=1;j<=n;j++)
		{
			if(Arrays.toString(p_a).contains(String.valueOf(j)))
			{
				r++;
				continue;
			}
			if(Arrays.toString(q_a).contains(String.valueOf(j)))
			{
				s++;
				continue;
			}
			
		}
		//System.out.println(r);
		//System.out.println(s);
		if(n==r+s)
			System.out.println("I become the guy.");
		else
			System.out.println("Oh, my keyboard!");
	}

}
