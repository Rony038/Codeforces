import java.util.Scanner;

public class A271 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int y = sc.nextInt();
		int a, b, c, d;
		while(true) {
			y = y+1;
			a = y / 1000;
			b = (y%1000)/100;
			c = ((y%100)%100)/10;
			d = ((y%100)%100)%10;
			if(a!=b && a!=c && a !=d && b!=c && b !=d && c!=d) {
				break;
			}
			
		}
		System.out.println(y);
		//System.out.println(b);
		//System.out.println(c);
		//System.out.println(d);
	}

}
