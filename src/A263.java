import java.util.Scanner;

public class A263 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0;
		int[][] arr = new int[6][6];
		int r=0, c=0;
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j<=5; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j<=5; j++) {
				if(arr[i][j]==1 && i>3 && j>3) {
					r = i-3;
					c = j-3;
				}
				else if(arr[i][j]==1 && i>3 && j<3) {
					r = i-3;
					c = 3-j;
				}
				else if(arr[i][j]==1 && i<3 && j>3) {
					r = 3-i;
					c = j-3;
				}
				
				else if(arr[i][j]==1 && i<3 && j<3) {
					r = 3-i;
					c = 3-j;
				}
				else if(arr[i][j]==1 && i==3 && j==3) {
					r = 3-i;
					c = 3-j;
				}
				else if(arr[i][j]==1 && i==3 && j>3) {
					r = 3-i;
					c = j-3;
				}
				else if(arr[i][j]==1 && i==3 && j<3) {
					r = 3-i;
					c = 3-j;
				}
				else if(arr[i][j]==1 && i>3 && j==3) {
					r = i-3;
					c = 3-j;
				}
				else if(arr[i][j]==1 && i<3 && j==3) {
					r = 3-i;
					c = 3-j;
				}
				
				//System.out.print(arr[i][j]+" ");
			}
			//System.out.println();
		}
		sum=r+c;
		System.out.println(sum);
		
	}

}
