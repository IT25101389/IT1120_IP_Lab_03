import java.util.Scanner;

public class IT25101389Lab3Q1A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//ask for price per kg
		System.out.print("Enter the price of 1KG: ");
		double pricePerKg = input.nextDouble();
		
		//ask for quantity in kg
		System.out.print("Enter the number of kilograms you want to buy: ");
		double quantity = input.nextDouble();
		
		//now the total amount you have to pay or total amount
		double totalAmount = pricePerKg * quantity;
		
		System.out.println("Total amount to pay: " + totalAmount);
	}
}