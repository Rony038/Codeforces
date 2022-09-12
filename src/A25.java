import java.util.Scanner;

public class A25 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		int[] a = new int[n];
		int count=0, c=0;
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				count++;
			}
			else {
				c++;
			}
		}
		
		if(c>count) {
			for(int i=0; i<a.length; i++) {
				if(a[i]%2==0) {
					System.out.println(i+1);
					break;
				}
			}
		}
		else {
			for(int i=0; i<a.length; i++) {
				if(a[i]%2!=0) {
					System.out.println(i+1);
					break;
				}
			}
		}
	}

}
