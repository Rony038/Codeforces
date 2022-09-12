import java.util.Arrays;
import java.util.Scanner;

public class A160 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		int sum=0; 
		int count=0, c=0;
		int[] a = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
			sum = sum+a[i];
		}
		sum = sum/2;
		Arrays.sort(a);
		
		for(int i=a.length-1; i>0; i--) {
			c = c+a[i];
			if(c>sum) {
				break;
			}
			else {
				count++;
			}
		}
		System.out.println(count+1);
		
	}

}
