import java.util.Scanner;

public class IT24101789Lab5Q2{
	public static void main(String[] args) {
		
		int newMembers;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the number of new members introduced: ");
		newMembers = input.nextInt();
		
		
		if (newMembers < 0 ){
			System.out.print("Input must be a number 0 or greater");
		return;
		}
				
		System.out.println();
		
		switch(newMembers){
			
			case 0 :
				System.out.print("Prize is a : No Prize");
				break;
				
			case 1 :
				System.out.print("Prize is a : Pen");
				break;
				
			case 2 :
				System.out.print("Prize is a : Umbrella");
				break;
			
			case 3 :
				System.out.print("Prize is a : Bag");
				break;
				
			case 4 :
				System.out.print("Prize is a : Travelling Chair");
				break;
				
			default :
				System.out.print("Prize is a : Headphone");
				break;
		}
		
		
	}
}