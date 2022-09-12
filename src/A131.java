import java.util.Scanner;

public class A131 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = sc.next();
		char[] s = s1.toCharArray();
		int i, up = 0;
		
		
		for (i = 0; i < s1.length(); i++)
		{
			if (s[i] < 91)
			{
				up++;
			}
		}

		if ((up == s1.length()) || ((s[0] > 91) && (s1.length() - 1 == up)))
		{
			for (i = 0; i < s1.length(); i++)
			{

				if (s[i] > 91) {
					s[i] = (char) (s[i] - 32);
				} else {
					s[i] = (char) (s[i] + 32);
				}
			}
		}
		System.out.println(s);
	}

}
