import java.util.Scanner;

public class A69 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		int p=0, q=0, s=0, a,b, c;
		for(int i=1; i<=n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			p = p+a;
			q = q+b;
			s = s+c;
		}
				
		//System.out.println(p);
		//System.out.println(q);
		//System.out.println(s);
		
		if(p==0 && q==0 && s==0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		

		
	}

}
