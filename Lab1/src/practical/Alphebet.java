package practical;
import java.util.*;
public class Alphebet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ");
		char ch=sc.next().charAt(0);
		if(ch >= 'A'&& ch <= 'Z'|| ch>='a'&&ch<='z') {
			System.out.println("Alphebet");		}
		else {
			System.out.println("Not an alphebet");
		}

	}

}
