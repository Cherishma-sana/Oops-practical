package Lab2;
 import java.util.*;
public class MaxMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int [] arr=new int[num];
	for(int i=0;i<num;i++) {
		arr[i]=sc.nextInt(); 
	}
 		int max=arr[0];
 		int min= arr[0];
 		for(int i=1;i<num;i++) {
 			if(arr[i]>max) {
 				max=arr[i];
 			}
 			if(arr[i]<min) {
 				min=arr[i];
 			}
 		}
 		System.out.println("maximum: " +max);
 	    System.out.println("Minimum: "+min);
 		
	}

}
