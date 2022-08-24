import java.util.Scanner;

public class A50 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M, N, square, domino, result = 0;
		M = sc.nextInt();
		N = sc.nextInt();
		square = M*N;
		domino = 2*1;
		if(1<=M && M<=N && N<=16) {
			result = square/domino;
		}
		System.out.println(result);
		
	}

}
