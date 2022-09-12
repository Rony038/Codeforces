import java.util.Scanner;

public class A136 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		//int b;
		int p[] = new int[n];
		//int temp[] = new int[n];
		for(int i=0; i<n; i++) {
			p[i]= sc.nextInt();
		}
		
		for (int j=1;j<=n; j++)
		{    
			for (int i=0; i<n; i++)
	        {
	          if(p[i]==j)
	          { 
	        	  System.out.println(i+1);
	        	  break;
	          }
	        }	
		}
	}
}
