import java.util.Scanner;

public class A4 {
	
	static Scanner myobj = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int w = myobj.nextInt();
		
		if(w%2==0 && w!=2) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
