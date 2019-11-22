//Unit 3 Lab
import java.util.Scanner;
import java.lang.*;
public class Classwork {
		
	

//----------------------------------------------------------------------------------------------			
			
// Java code to alternatively merge two strings 		
			
			public static void main(String[] args){
			//inputs string 1
		System.out.print ("Enter String 1: ");
		Scanner input = new Scanner(System.in);
		String s1 = input.next();
		
		//inputs string 2
			System.out.print ("Enter string 2: ");
			input = new Scanner(System.in);
			String s2 = input.nextLine( );
			
			//merges two strings 
			System.out.println(s1.substring(0,s1.length()/2) + s2.substring(s2.length()/2));

	}

}

//----------------------------------------------------------------------------------------------	

public static void main(String[] args){
Scanner in = new Scanner(System.in);
System.out.print("Input an integer: ");
int digits = in.nextInt();
System.out.println("Sum: " + sumDigits(digits));
}

public static int sumDigits(long n) {
	int answer = 0;
	
	while(n > 0) {
		answer += n % 10;
		n /= 10;
	}
	return answer;
}
}

//----------------------------------------------------------------------------------------------	

//	A password must have at least ten characters.
//	A password consists of only letters and digits.
//	A password must contain at least two digits.
 
public static final int passwordLength = 8;

public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input Password: ");
        String s = input.nextLine();

        if (is_Valid_Password(s)) {
            System.out.println("Password is valid: " + s);
        } else {
            System.out.println("Not a valid password: " + s);
        }

    }

    public static boolean is_Valid_Password(String password) {

        if (password.length() < passwordLength) return false;

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else return false;
        }


        return (charCount >= 2 && numCount >= 2);
    }

    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }


    public static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }

}

//----------------------------------------------------------------------------------------------	

	
	public static void main (String[ ] args){

		 //Inputs sentence
		 System.out.println ("Input one or more sentence(s).");
		 System.out.println ("Be sure to enter an extra space at the end!\n");
		 Scanner input = new Scanner(System.in);
		 String sentence = input.nextLine( );

		 //stores return value of wordCount in count
		 int count = wordCount(sentence);

		 System.out.println ("Word Count: " + count);

		 //Finds substring word to output
		 System.out.println ("Which word (#) do you want printed out? ");
		 input = new Scanner(System.in);
		 int num = input.nextInt( );

		 String word = findWord(sentence, num - 2);
		 System.out.println ("Word #" + num + " in your input is \"" + word + "\"");
		 }

		 public static int wordCount(String search) {
		 //Counts # of words in string by counting # of spaces
		 int spaces = 0;
		 for (int i = 0; i < search.length( ); i++) {
		 if (search.charAt(i) == ' ') {
		 spaces++;
		 }
		 }

		 return spaces;
		 }

		 public static String findWord(String search, int find) {
		 //searches string for substring word at requested space count
		 int start = 0;
		 int end = 0;
		 int track = 0;

		 for (int i = 0; i < search.length( ); i++) { 
		 if (search.charAt(i) == ' ') {
		 track++;
		 }
		 else if (track == find) {
		 start = i + 2;
		 }
		 else if (track == find + 1) {
		 end = i + 1;
		 }
		 }

		 String word = search.substring(start, end);

		 return word;
		 }
		}











