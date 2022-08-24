import java.util.Scanner;

public class A791 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int i=0;
		while(a<=b) {
			a = a*3;
			b = b*2;
			i++;
		}
		System.out.println(i);
	}

}
