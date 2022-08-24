import java.util.Scanner;

public class A266 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int n = sc.nextInt();
		  int counter=0;
		  String s1 = sc.next();
		  
		  char last = s1.charAt(0);
		  for(int i=1; i<n;i++) {
			  if(s1.charAt(i)==last){
				  counter++;
			  } 
			  else { 
				  last = s1.charAt(i);
			  } 
		  }
		  
		  System.out.println(counter);	 		
		
		  
		  
		  /*
		  char tempArray[] = s1.toCharArray();
          for(int i = 1; i < tempArray.length; i++)
          {
              if (tempArray[i-1] == tempArray[i])
              {
                  counter++;
              }
          }
          System.out.println(counter);;
		*/
	}

}
