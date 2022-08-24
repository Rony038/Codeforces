import java.util.Scanner;

public class A677 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = sc.nextInt();
		int h = sc.nextInt();
		int[] arr = new int[n];
		int count=0;
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			if(arr[i]>h) {
				count=count+2;
			}
			else {
				count=count+1;
			}
		}
		System.out.println(count);

	}

}
