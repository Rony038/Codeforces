import java.util.Scanner;

public class A785 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		String[] s = new String[n];
		int face=0;
		
		for(int i=0; i<s.length; i++) {
			s[i]= sc.next();
			if(s[i].equals("Tetrahedron")) {
				face = face+4;
			}
			else if(s[i].equals("Cube")) {
				face = face+6;
			}
			else if(s[i].equals("Octahedron")) {
				face = face+8;
			}
			else if(s[i].equals("Dodecahedron")) {
				face = face+12;
			}
			else if(s[i].equals("Icosahedron")) {
				face = face+20;
			}
		}
		
		System.out.println(face);
	}

}
