package practical;
import java.util.*;
public class Tonyresturent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the base bill Amount: ");
		double amount=sc.nextDouble();
		double gst=0.18*amount;//18% GST
		double maintenance=0.05*amount;//5% maintenance
		double Totalamountbeforediscount=gst+maintenance+amount;
		double discount;
		if(amount>1000) {
			 discount=0.10*amount;
		}
		else {
			 discount=0.05*amount;
		}
		double Finalamount = Totalamountbeforediscount - discount;
		System.out.println("---------------set bill---------------");
		System.out.println("THE AMOUNT :" + "RS "+amount);
		System.out.println("GST 18%:"+"	RS "+gst);
		System.out.println("Maintenance 5%:"+"RS "+ maintenance);
		System.out.println("Total amount before discount: "+"RS "+Totalamountbeforediscount);
		System.out.println("Final amount:"+" "+"RS "+Finalamount);
	}

}
