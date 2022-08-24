import java.util.Scanner;

public class A231 {
	static Scanner myobj = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = myobj.nextInt();
		int size = 3;
		int b=0, count=0;
		int a[] = new int[3];
		for(int i=0; i<n; i++) {
			for(int j=0; j<size; j++) {
				a[j] = myobj.nextInt();
			}
			
			b= a[0]+a[1]+a[2];
			if(b>=2) {
				count++;
			}
			
			
		}
		System.out.println(count);
		

	}

}
