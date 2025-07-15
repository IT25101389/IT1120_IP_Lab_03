import java.util.Scanner;

public class IT25101389Lab3Q1B {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//discount 10%
		double discount = 0.10;
		
		//ask for price per kg
		System.out.print("Enter the price of 1KG: ");
		double pricePerKg = input.nextDouble();
		
		//ask for quantity in kg
		System.out.print("Enter the number of kilograms you want to buy: ");
		double quantity = input.nextDouble();
		
		//now the total amount you have to pay or total amount
		double totalAmount = pricePerKg * quantity;
		
		//Calculate the discount
		double discountTotal = totalAmount * discount;
		
		//Finally finalAmount after Discount total
		double finalAmount = totalAmount - discountTotal;
		
		System.out.println();
		System.out.println("The total amount after 10% discount is: " + finalAmount);
	}
}