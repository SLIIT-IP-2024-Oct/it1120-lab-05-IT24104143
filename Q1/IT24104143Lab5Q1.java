import java.util.Scanner;

  public class IT24104143Lab5Q1{
  public static void main(String [] args){
   
   
  Scanner input = new Scanner(System.in);
 
   System.out.print("Enter the first integer  :");
   int firstInteger = input.nextInt();
   
   System.out.print("Enter the Second integer :");
   int secondInteger = input.nextInt();
   
   System.out.print("Enter the third integer  :");
   int thirdInteger = input.nextInt();
   System.out.println("  ");
   
    System.out.println("User Entered numbers are :" +firstInteger+ " "+secondInteger+ " "+thirdInteger+" "  );
   if (firstInteger > secondInteger && firstInteger > thirdInteger )
   {System.out.println("The largest number is   :" + firstInteger);
    }

   else if(secondInteger > firstInteger && secondInteger > thirdInteger )
   {System.out.println("The largest number is   :" + secondInteger);
    }
   
   
    else
   {System.out.println("The largest number is :" + thirdInteger);
    }
	
	if (firstInteger < secondInteger && firstInteger < thirdInteger )
   {System.out.println("The smallest number is :" + firstInteger);
    }

   else if(secondInteger < firstInteger && secondInteger < thirdInteger )
   {System.out.println("The smallest number is :" + secondInteger);
    }
   
   
    else
   {System.out.println("The smallest number is :" + thirdInteger);
    }
   
  
      }
   }
   
 