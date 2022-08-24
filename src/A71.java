import java.util.Scanner;

public class A71 {
	
	static Scanner myobj = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int length = myobj.nextInt();
		String s= null;
		
		for(int i=0; i<=length; i++) {
			
			 s = myobj.nextLine();
			
			
			if(s.length()>10) {
			  //int output = s.charAt(0)+s.length()-2+s.charAt(s.length()-1);
				//char f = s.charAt(0);
				//char l = s.charAt(s.length()-1);
				//int m = s.length()-2;
				
				//String output = new StringBuilder().append(s.charAt(0)).append(s.length()-2).append(s.charAt(s.length()-1)).toString();
				//System.out.println(output);
				System.out.print(s.charAt(0));
				System.out.print(s.length() -2); 
				System.out.println(s.charAt(s.length() -1));
			}
			else {
				System.out.println(s);
			}
		}

	}

}
