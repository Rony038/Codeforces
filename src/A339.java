import java.util.Arrays;
import java.util.Scanner;

public class A339 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = sc.next();
		sortString(s1);
	}
	
	public static String sortString(String s1)
    {
        // Converting input string to character array
		String s2 = s1.replace("+", "");
        char tempArray[] = s2.toCharArray();
        
     // Sorting temp array using Arrays.sort() method
        Arrays.sort(tempArray);

		for(int i =0; i<tempArray.length; i++) {
			System.out.print(tempArray[i]);
			if(i == tempArray.length-1) {
                continue;
			}
            System.out.print("+");
		}
		System.out.println();
        
        // Returning new sorted string
        return new String(tempArray);
    }

}
