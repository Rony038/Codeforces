import java.util.Scanner;

public class A580 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		
		int count=1, max=1;
		
		int a[] = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i=1; i<a.length; i++) {
			if(a[i-1]<=a[i]) {
				count++;
				if(count>max) {
					max = count;
				}
			}
			else {
				count = 1;
			}
			
		}
		
		System.out.println(max);
	}

}
