import java.util.Scanner;

public class OddDiamond {    
     
   public static void main (String[ ] args){   
      
      //User input for odd number
      System.out.println ("Pick an odd number: ");
      Scanner input = new Scanner(System.in);
      int num = input.nextInt( );   
      
      //Tests if number is odd
      while (num % 2 == 0){
       System.out.println ("That is not an odd number!");
       System.out.println ("Pick an odd number: ");
       input = new Scanner(System.in);
       num = input.nextInt( );
      }
      
      //Initiates values for median number value, start 
      //digit and number of digits to print per line
      int startDig = num / 2 + 1;
      int half = startDig;
      int numOfDig = 1;
      
      //Generates 1st half of diamond, amount of digits increase
      for (int line = 1; line <= half; line++){    //Goes line by line
         int i = 1;      
          
         for (int digit = 1; digit <= num; digit++){       //Goes digit by digit   
               if (digit >= startDig && i <= numOfDig){    //Determines output based on location                                     
                     System.out.print (digit + " ");                      
                     i++;    
                  }   
               else {
                  System.out.print (" " + " ");      
               }              
                
          }   
          //Skips to next line and moves starting digit
          //and increase how many digits appear on line       
          startDig--;                     
          numOfDig += 2; 
          System.out.print ("\n");
      }
      
      //Adjusts start position and number of digits displayed
      //back to 1st position (last loop made one more increment
      //change before exiting
      startDig++;    
      numOfDig -= 2;
      
      //Generates second half of diamond following same style logic backwards
      for (int line = half + 1; line <= num; line++){
         int i = 1;
         startDig++;          //In this case, we want to have increments changed
         numOfDig -= 2;       //prior to loops running so previous line does not repeat
              
         for (int digit = 1; digit <= num; digit++){         
               if (digit >= startDig && i <= numOfDig){                                         
                     System.out.print (digit + " ");                      
                     i++;    
                  }   
               else {
                  System.out.print (" " + " ");      
               }              
                
          }             
          System.out.print ("\n");
      }

   }
}
