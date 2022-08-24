import java.util.Scanner;
/*-----both solution works------*/
public class A617 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = sc.nextInt();
		int count=0, reminder=0;
		
			/*if(x>=5) {
				count = x/5;
				reminder = x%5;
				if(reminder==4) {
					count = count + (reminder/4);
					reminder = reminder%4;
				}
				if(reminder==3) {
					count = count + (reminder/3);
					reminder = reminder%3;
				}
				if(reminder==2) {
					count = count + (reminder/2);
					reminder = reminder%2;
				}
				if(reminder==1){
					count = count+1;
				}
				System.out.println(count);
			}
			else {
				System.out.println(1);
			}
			*/
		count = x/5;
		if(x%5>0) {
			count++;
		}
		System.out.println(count);
				

	}

}
