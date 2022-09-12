import java.util.Scanner;

public class A133 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = sc.nextLine();
		if(s.contains("H") || s.contains("Q") || s.contains("9"))
		{
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
