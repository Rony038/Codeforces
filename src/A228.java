import java.util.Scanner;

public class A228 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		int s4 = sc.nextInt();
		int count=1;
		int c =0;
		if(s1!=s2 && s1!=s3 && s1 !=s4) {
			count++;
		}
		if(s2!=s3 && s2!= s4) {
			count++;
		}
		if(s3!=s4) {
			count++;
		}
		count = 4 -count;
		System.out.println(count);
	}

}
