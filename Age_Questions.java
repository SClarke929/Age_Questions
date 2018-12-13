import java.util.Scanner;
public class Age_Questions {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);		
		int number = scanner.nextInt(); 
		int age = number;


		System.out.println("Can I get a tattoo?");

		if (age <= 17) { 
			System.out.println("You are too young to get a tattoo!");
		}
		else   {
			System.out.println("You can get a tattoo!");
		}

		System.out.println("Can I buy an alcoholic drink?");
		if (age <= 20) { 
			System.out.println("You are too young to drink alcohol!");
		}
		else   {
			System.out.println("You can get a drink!");
			}
		
		System.out.println("Can I run for U.S. President?");
		if (age <= 34) { 
			System.out.println("You are too young to run for President of the U.S.");
		}
		else   {
			System.out.println("You can run for President of the U.S!");
			}
		scanner.close(); 
	}
             
}