import java.util.Scanner;

public class CashRegister
{
 public static void main(String[ ] args)
 {
   char answer = 'Y';
   while (answer == 'y' || answer == 'Y'){
      /*This section collects the item name*/
      System.out.print ("What sale item do you want to buy? ");
      Scanner input = new Scanner(System.in);
      String itemName = input.next( );
  
      /*This section collects the item amount*/
      System.out.print ("What is the price of " + itemName + "? $");
      input = new Scanner(System.in);
      double itemPrice = input.nextDouble( );
      
      /*This section calculates all item info*/
      int perDisc;
      double dolDisc, tax, total;
      
      perDisc = (int) (Math.random( ) * 70) + 5;
      while ((perDisc < 5 || perDisc > 75) || (perDisc % 5 != 0)){
         perDisc = (int) (Math.random( ) * 70) + 5;
      }
      
      dolDisc = itemPrice * ((double)perDisc / 100);
      tax = (itemPrice - dolDisc) * 0.07;
      total = itemPrice - dolDisc + tax;
      
      /*This section outputs the item info*/
      System.out.println ("Item Name: " + itemName);
      System.out.println ("Original Price: $" + itemPrice);
      System.out.println ("Percent Discount: " + perDisc + "%");
      System.out.println ("Discount Amount: $" + dolDisc);
      System.out.println ("7% Sales Tax: $" + tax);
      System.out.println ("Final Price: $" + total);
     
      /*This section collects user $ given*/ 
      System.out.print ("What amount are you paying with? $");
      input = new Scanner(System.in);
      double amount = input.nextDouble( );
      
      double change = amount - total;
      System.out.println ("Your change will be $" + change);
      System.out.println ("It will be divided up like this:");
      
      /*This section extracts the whole dollar amount and prints it*/ 
      int d_bills = (int) change;
      System.out.println ("\nDollar Bills = " + d_bills); 
  
      /*This section extracts the cents from the amount and removes decimal*/
      int cents = (int) (((change - d_bills) * 100) + .01);     // + .01 accounts for overflow
  
      /*This section figures out the amount of each coin and prints it*/
      int q = cents / 25;
      System.out.println ("Quarters = " + q);
      cents = cents % 25;      //assigns cents to the leftover amount after quarters removed
    
      int d = cents / 10;
      System.out.println ("Dimes = " + d);
      cents = cents % 10;      //assigns cents to the leftover amount after dimes removed
    
      int n = cents / 5;
      System.out.println ("Nickels = " + n);
    
      int p = cents % 5;      //assigns cents to the leftover amount after nickels removed
      System.out.println ("Pennies = " + p);
   
   System.out.print ("Would you like to purchase another item (Y or N)? ");
   input = new Scanner(System.in);
   String temp = input.next( );
   answer = temp.charAt(0);
   }
 }
} 
