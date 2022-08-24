import java.util.Scanner;

public class A118 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = sc.next();
		
		
		char tempArray[] = s1.toLowerCase().toCharArray();
		
		for(int i=0; i<tempArray.length; i++) {
			if(tempArray[i]=='a'|| tempArray[i]=='e'|| tempArray[i]=='i'|| 
					tempArray[i]=='o'|| tempArray[i]=='u' || tempArray[i]=='y') {
				continue;
			}
			System.out.print('.');
			System.out.print(tempArray[i]);
		}
		//System.out.println(tempArray);

	}

}
