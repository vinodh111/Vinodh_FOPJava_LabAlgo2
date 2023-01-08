package com.gl.javafsd.paymoney;

import java.util.Scanner;

public class Main {

	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.println("Enter the number of transactions :");  
	        int transactionArraySize = input.nextInt();
	        int[] transactions = new int[transactionArraySize];
	       
	 
	        System.out.println("Enter the transaction values:");    
	        for (int index = 0; index < transactionArraySize; index ++) {
	            transactions[index] = input.nextInt();
	        }              
	       
	        System.out.print("Enter the number of targets (instances) to be achieved:");
	        int transactionsInstanceSize = input.nextInt();
	       
	        for (int count = 1; count <= transactionsInstanceSize; count ++) {
	 
	            System.out.println();
	            System.out.print("Enter the target value :");
	            int dailyTarget = input.nextInt();

	            System.out.println("Processing transactions with target value -> "
                        + dailyTarget);

	            TargetDeterminator determinator =
	            		new TargetDeterminator(transactions, dailyTarget);

	            determinator.determine();

}

	        if(input !=null) {
	        	input.close();
}
}
}


	        