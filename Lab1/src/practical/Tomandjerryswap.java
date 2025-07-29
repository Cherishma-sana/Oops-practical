package practical;
import java.util.*;
public class Tomandjerryswap {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("The apples the Jerry's bag:");
		int Jerry=sc.nextInt();
		System.out.println("The apples in the Tom's bag:");
		int Tom =sc.nextInt();
		int a=Jerry;
		a=Tom;
		Tom=Jerry;
		Jerry=a;
		 
		 System.out.println("The apples in the Toms bag after swapping"+ Tom);
		 System.out.println("The apples in the Jerrys bag after swapping"+Jerry);
		
		
		

	}

}
