import java.util.Scanner;

public class LowestFactor {    
     
   public static void main (String[ ] args){   
      
      //User input for 1st number and verifiies int > 1 
      System.out.println ("Input a positive integer greater than 1: ");
      Scanner input = new Scanner(System.in);
      int num1 = input.nextInt( );   
      
      while (num1 <= 1){
         System.out.println ("That was not integer greater than 1!!!!");
         System.out.println ("Input a positive integer greater than 1: ");
         input = new Scanner(System.in);
         num1 = input.nextInt( );   
      }
      
      //User input for 2nd number and verifiies int > 1
      System.out.println ("Input a second positive integer greater than 1: ");
      input = new Scanner(System.in);
      int num2 = input.nextInt( );
      
      while (num2 <= 1){
         System.out.println ("That was not integer greater than 1!!!!");
         System.out.println ("Input a positive integer greater than 1: ");
         input = new Scanner(System.in);
         num2 = input.nextInt( );   
      }
      
      //Divides each number by values 2+ until LCF is found
      int i = 2;
      while (i < 10 && i != 0){
         if (num1 % i == 0 && num2 % i == 0){
            System.out.printf ("%d is the lowest common factor of %d and %d\n", i, num1, num2);            
            if (num1 == i){
               System.out.printf ("%d is also a prime number!", num1);  
            }
            else if (num2 == i){
               System.out.printf ("%d is also a prime number!", num2);  
            }
         
         i = 0;
         }         
         else{
            i++;
         } 
      }
      
      //Checks for prime numbers 
      if (i == 10){
         if (((num1 % 2 != 0 && num1 % 3 != 0 && num1 % 5 != 0) || (num1 == 2 || num1 == 3 || num1 == 5)) && ((num2 % 2 != 0 && num2 % 3 != 0 && num2 % 5 != 0) || (num2 == 2 || num2 == 3 || num2 == 5))){
            System.out.println ("Both numbers are prime!!!");             
         } 
         else if (num2 % 2 != 0 && num2 % 3 != 0 && num2 % 5 != 0 || (num2 == 2 || num2 == 3 || num2 == 5)){
            System.out.printf ("%d is prime!", num2); 
         }
         else if (num1 % 2 != 0 && num1 % 3 != 0 && num1 % 5 != 0 || (num1 == 2 || num1 == 3 || num1 == 5)){
            System.out.printf ("%d is prime!", num1);
         }
         else if (num1 == 2 || num1 == 3 || num1 == 5){
            System.out.printf ("%d is prime!", num1);
         }
         else if (num2 == 2 || num2 == 3 || num2 == 5){
            System.out.printf ("%d is prime!", num2);
         }
         else {
            System.out.printf ("%d and %d have no common factors!", num1, num2);
         }  
      }
   }
}
