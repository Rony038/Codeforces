import java.util.Scanner;

public class A282 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, x = 0;
		String y;
		String a = "X++";
		String b = "++X";
		
		
		
		n = sc.nextInt();
		String[] str = new String[n];
		for(int i=0; i<n; i++) {
			/*next() Method: The next() method in java is present
			in the Scanner class
			and is used to get the input from the user. In order to use this method,
			a Scanner object needs to be created.
			This method can read the input only until a space(” “) is encountered.*/
			y = sc.next();
			/*
			 nextLine() Method: The nextLine() method in java is present in the
			  Scanner class and is used to get the input from the user. In order to
			   use this method, a Scanner object needs to be created. 
			   This method can read the input till the end of line. In other words,
			    it can take input until the line change or new line and ends input
			     of getting ‘\n’ or press enter. */
			str[i] = y;
			//op[i]= sc.nextLine();
		}
		for(int j=0; j<n; j++) {
			if(str[j].equals(a) || str[j].equals(b)) {
				x++;
			}
			else {
				x--;
			}	
		}
		
		System.out.println(x);
	}

}
