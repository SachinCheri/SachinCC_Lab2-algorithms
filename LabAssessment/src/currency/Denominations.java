package currency;

import java.util.Scanner;

public class Denominations {

	public static void main(String[] args) {
		
		MergeSort mergeSortImplementation = new MergeSort();
		Notes notesCount= new Notes();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of currency denominations");
		int size =sc.nextInt();
		int[] notes =new int[size];
		
		System.out.println("Enter the currency denomination value ");
		for (int i=0;i<size;i++) {
			notes[i]=sc.nextInt();
			
		}
		System.out.println("Enter the amount you want to pay ");
		int amount = sc.nextInt();
		mergeSortImplementation.sort(notes,0,notes.length-1);
		notesCount.notesCount(notes, amount);
		
	}

}
