import java.util.Scanner;

public class A61 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = sc.next();
		String s2 = sc.next();
		char[] chars1 = s1.toCharArray();
		char[] chars2 = s2.toCharArray();
		char[] result = new char[chars1.length];
		for(int i=0; i<chars1.length; i++) {
			if(chars1[i]==chars2[i]) {
				result[i] = '0';
			}
			else if(chars1[i]=='1' || chars2[i]=='1') {
				result[i] = '1';
			}
			else {
				result[i] = '0';
			}
		}
		
		System.out.println(result);
	}

}
