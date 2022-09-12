import java.util.Scanner;

public class A1030 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = sc.nextInt();
		int a[] = new int[n];
		int count1=0, count0=0;
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0; i<a.length; i++) {
			if(a[i]==1) {
				count1++;
			}else {
				count0++;
			}
		}
		if(count1>=1) {
			System.out.println("HARD");
		}
		else {
			System.out.println("EASY");
		}
	}

}
