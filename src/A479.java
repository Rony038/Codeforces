import java.util.Arrays;
import java.util.Scanner;

public class A479 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d=0, e=0, f=0, g=0, h=0, m =0, o=0, i, j, k, l, n, p;
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		d = a+b+c;
		e = a+(b*c);
		f = (a*b)+c;
		g = (a*c)+b;
		h = a*b*c;
		m = (a+b)*c;
		o = (b+c)*a;
		i = Math.max(d, e);
		j = Math.max(f, g);
		k = Math.max(i, j);
		l = Math.max(k, h);
		n = Math.max(m, l);
		p = Math.max(n, o);
		System.out.println(p);
		
		/*for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		for(int i =0; i<a.length; i++) {
			System.out.println(a[i]);
		}*/
		
				
	}

}
