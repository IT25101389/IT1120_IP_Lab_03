import java.util.Scanner;

public class IT25101389Lab3Q2 {
	
	public static void main(String[] args){
		
		//Declare the variables
		double monthlySalary , otHours , otHourlyRate , otAmount , totalSalary;
		
		Scanner input = new Scanner(System.in);
		
		//Monthly salary
		System.out.print("Enter your monthly salary: ");
		monthlySalary = input.nextDouble();
		
		//otHours
		System.out.print("Enter the number of OT hours: ");
		otHours = input.nextDouble();
		
		//otHourlyRate
		System.out.print("Enter the OT hourly rate: ");
		otHourlyRate = input.nextDouble();
		
		//Calculate the OT amount
		otAmount = otHours * otHourlyRate;
		
		//Calculate Total Salary
		totalSalary = monthlySalary + otAmount;
		
		System.out.print("The total salary including OT is: " + totalSalary);
	}
}
		