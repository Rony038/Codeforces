import java.util.Scanner;
/*------both solution works------------*/
public class A96 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = sc.next();
		/*int counter = 1;
		char[] charArray = s.toCharArray();
		for(int i=1; i<charArray.length; i++) {
			if(charArray[i-1]==charArray[i]) {
				counter++;
				if(counter>=7) {
					break;
				}
			}
			else {
				counter = 1;
			}
		}
		if(counter>=7) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}*/
		
		if(s.contains("1111111")|| s.contains("0000000")) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
