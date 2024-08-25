import java.util.Scanner;

public class IT24101789Lab5Q3{
	public static void main(String[] args) {
		
		double roomChargePerDay = 48000.00;
		double discount1 = 90.0/100;
		double discount2 = 80.0/100;
		int startDate , endDate , daysReserved;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Start Date (1-31): ");
		startDate = input.nextInt();
		
		System.out.print("Enter End Date (1-31): ");
		endDate = input.nextInt();
		
		if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
			System.out.print("Error: Days must be between 1 and 31 ");
			return ;
		} 
		
		if (startDate > endDate) {
			System.out.print("Error: Start Date must be less than End Date ");
			return;
		}
		
		System.out.println();
		
		System.out.println("Room Charge Per Day: "+ roomChargePerDay+ "/=");
		
		daysReserved = endDate - startDate;
		System.out.println("Number of Days Reserved: " + daysReserved);
		
		if (daysReserved < 3){
			System.out.print("Total Amount to be Paid: "+ roomChargePerDay * daysReserved);
			return;
		}
		
		if (daysReserved == 3 || daysReserved == 4 ){
			System.out.print("Total Amount to be Paid: "+ roomChargePerDay * daysReserved * discount1);
			return;
		}
		
		if (daysReserved >= 5){
			System.out.print("Total Amount to be Paid: "+ roomChargePerDay * daysReserved * discount2);
			return;
			
		}
	}
}