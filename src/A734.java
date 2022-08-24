import java.util.Scanner;

public class A734 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		String s = sc.next();
		int countA=0, countD=0; 
		//char[] charArray = s.toCharArray();
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='A') {
				countA++;
			}
			else {
				countD++;
			}
		}
		if(countA>countD) {
			System.out.println("Anton");
		}
		else if(countD>countA) {
			System.out.println("Danik");
		}
		else {
			System.out.println("Friendship");
		}
		
	}

}
