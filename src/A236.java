import java.util.HashSet;
import java.util.Scanner;

public class A236 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String s1 = sc.next();
		  
		  HashSet<Character> set= new HashSet<>();

		  for(int i=0; i<s1.length(); i++) {
			  set.add(s1.charAt(i));
		  }
		  
		  if(set.size()%2==0) {
			  System.out.println("CHAT WITH HER!");
		  }
		  else {
			  System.out.println("IGNORE HIM!");
		  }
		
	}

}
