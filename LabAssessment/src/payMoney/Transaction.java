package payMoney;

import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) throws Exception {
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array");
		int noOfTransactions = s.nextInt();
		int arr[]= new int[noOfTransactions];
		
		System.out.println("Enter the values of array");
		for (int i =0;i<noOfTransactions;i++)
		
			arr[i]=s.nextInt();
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		
		int targetTransactions = s.nextInt();
		
		while(targetTransactions-- !=0) {
			int flag =0;
			long targetTransactions1;
			
			System.out.println("Enter the value of target");
			targetTransactions1 =s.nextInt();
			
			long sum =0;
			
			for (int i= 0;i<noOfTransactions;i++) {
				sum+=arr[i];
				
				if (sum>=targetTransactions1) {
					System.out.println("Target achieved "+(i+1)+" transactions");
					flag=1;
					break;
					
				}
			}
		if (flag==0) {
			System.out.println("Given target is not achieved");
			
		}
			}
		
	}

}
