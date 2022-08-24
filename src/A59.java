import java.util.Scanner;

public class A59 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = sc.next();
		int count=0, counter=0;
		char[] charArray = s.toCharArray();
		for(int i=0; i<charArray.length; i++) {
			if(charArray[i]>=65 && charArray[i]<=90) {
				count++;
			}
			else {
				counter++;
			}
		}
		if(count>counter) {
			System.out.println(s.toUpperCase());
		}
		else {
			System.out.println(s.toLowerCase());
		}
	}

}
