//Restaurant Class
import java.util.*;
public class Restaurant {
	
	//Create a method to print an array to screen
	public static void printArray(String array[]){
		for (int i = 0; i < array.length; i++){
			if(i>0){
				System.out.print(", ");
			}
			System.out.print(array[1]);
		}

	}
	
	public static void main(String[] args) {
		//Number of people to be seated
		int party = 5;
		
		//Call the greet method in the Hostess class
		Hostess.greet(party);
		
		//Call the getDrinks method in the server class
		String[ ] drinks;
		drinks = Server.getDrinks(party);
		printArray(drinks);
		
}
}
