import java.util.Scanner;

public class IT24101789Lab5Q1{
	public static void main(String[] args){
		
		int firstInteger , secondInteger, thirdInteger, smallestNumber, largestNumber;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("Enter the first integer: ");
		firstInteger = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		secondInteger = input.nextInt();
		
		System.out.print("Enter the thirdInteger integer: ");
		thirdInteger = input.nextInt();
		
		System.out.println();
		
		System.out.println("User entered numbers are : "+ firstInteger+ " " + secondInteger+ " " + thirdInteger);
		
		smallestNumber = firstInteger;
		largestNumber = firstInteger;
		
		if (secondInteger < smallestNumber) {
            smallestNumber = secondInteger;
        }
        if (secondInteger > largestNumber) {
            largestNumber = secondInteger;
        }
        
        if (thirdInteger < smallestNumber) {
            smallestNumber = thirdInteger;
        }
        if (thirdInteger > largestNumber) {
            largestNumber = thirdInteger;
        }
		
		System.out.println("The Smallest number is: "+ smallestNumber);
		System.out.print("The Largest number is: "+ largestNumber);
		
		System.out.println();
		
	}
}