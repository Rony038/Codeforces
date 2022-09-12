import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class duplicate_word_remove {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = sc.nextLine();
		String result="";
		String[] arrOfStr = s.split(" ");
		/*for (String a : arrOfStr)
            System.out.println(a);*/
		
		LinkedHashSet<String> set = new LinkedHashSet<String>( Arrays.asList(arrOfStr) );
        
		// Convert to String
		for(String word: set) {
			result = result + word + " ";
		}
		// Display given String after removing duplicates
		System.out.println(result);

		

	}

}
