import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class B158 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		int a[] = new int[n];
		int count = 0, c = 0, r=0, t=0, tr=0, one=0, two=0, three=0; 
		//ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		//Arrays.sort(a);
		/*for(int i=0; i<n; i++) {
			System.out.println(a[i]);
		}*/
		for(int i=0; i<a.length; i++) {
			if(a[i]==4) {
				count++;
			}
			else if(a[i]==1) {
				one++;
				System.out.println(one);
			}
			else if(a[i]==2) {
				two++;
			}
			else if(a[i]==3) {
				three++;
			}
		}
		
		if((one+three)%2==0) {
			c = (one+three)/2;
		}
		else if((one+three)%2!=0){
			c = (one+three)/2;
			r = (one+three)%2;
			//one = one -c;
		}
		
		else if(two%2==0) {
			t = two/2;
		}
		else if(two%2!=0) {
			t = (two)/2;
			tr = (two)%2;
		}
		
		
		/*System.out.println(two);
		System.out.println(three);*/

		System.out.println(count+c+r+t+tr);
		System.out.println(count);
		System.out.println(c);
		System.out.println(r);
		System.out.println(t);
		System.out.println(tr);
	}

}
