import java.util.Scanner;

public class IT24104143lab5Q3 {  
    public static void main(String[] args) {

        
        final double room_charge_per_day = 48000.00;
        final double discount_3_4_days = 0.1;  
        final double discount_5_or_more_days = 0.2;  

        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter start date (1 - 31): ");
        int start_date = input.nextInt();

        System.out.print("Enter end date (1 - 31): ");
        int end_date = input.nextInt();

        
        if (start_date < 1 || start_date > 31 || end_date < 1 || end_date > 31) {
            System.out.println("Error: Dates must be between 1 and 31.");
            return;  
        }

        if (start_date >= end_date) {
            System.out.println("Error: Start date must be less than end date.");
            return;  
        }

     
        int numberofdays = end_date - start_date;
        double totalamount = numberofdays * room_charge_per_day;
        double discount = 0.0;  

       
        if (numberofdays < 3) 
		{
         discount = 0.0;  
        } 
		else if (numberofdays >= 3 && numberofdays <= 4)
		{
         discount = discount_3_4_days * totalamount;  // 10% discount
        } 
		else if (numberofdays >= 5) 
		{
         discount = discount_5_or_more_days * totalamount;  // 20% discount
        }

        
        double finalamount = totalamount - discount;

        
        System.out.println("  ");
        System.out.println("Room charge per day: Rs. " + room_charge_per_day);
        System.out.println("Number of days reserved: " + numberofdays);
        System.out.println("Total amount to be paid: Rs. " + finalamount);

        
        
    }
}