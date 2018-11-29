/*
Mouner Dabjan 
November 29 2018
This program is created to validate data entered by the user 
 */

package datavalidation;
import java.util.Scanner; 
/**
 *
 * @author modab5310
 */
public class DataValidation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String userInput; 
        int userNum;
        int remainder; 
        Scanner keyBoard = new Scanner(System.in); 
        Scanner keyedInput = new Scanner(System.in); 
        boolean valid = false; 
        
        while(valid==false)
        {
            System.out.println("Enter a 6 characters long string: ");
            userInput = keyBoard.nextLine();
            
            if(userInput.length()<6)
            {
                System.out.println("Please enter a 6 characters long string");
            }
            else
            {
                valid=true; 
            }
        }
        
        valid =false;
        while(valid==false)
        {
            System.out.println("Enter a string that contains atleast one lowercase a");
            userInput = keyBoard.nextLine(); 
            
            if(userInput.contains("a"))
            {
                valid=true;
            }
            else
            {
                System.out.println("Please enter a string that contains atleast one a ");
            }
                
        }
        
        valid =false;
        
        while(valid==false)
        {
            System.out.println("Please enter a string that is between 5 and 15 characters long and  contain the letter z");
            userInput = keyBoard.nextLine();
            
            if(userInput.length()>=5 && userInput.length()<=15 && userInput.contains("z"))
            {
                valid=true;
            }
            else
            {
                System.out.println("Please enter a 5 to 15 long character with the letter z");
            }
        }
        
        valid = false; 
        
        while(valid==false)
        {
            System.out.println("Enter an Integer between 5 and 500");
            userNum = keyedInput.nextInt();
            
            if(userNum>=5 && userNum<=500)
            {
                valid = true;
            }
            else
            {
                System.out.println("Please enter an integer between 5 and 500");
            }
                   
        }
        valid = false;
        
        while(valid==false)
        {
            System.out.println("Please enter a negative integer");
            userNum = keyedInput.nextInt(); 
            
            if(userNum<0)
            {
                valid = true;
            }
            else
            {
                System.out.println("Please enter a negative integer");
            }
        }
        
        valid = false;
        
        while(valid==false)
        {
            System.out.println("Enter a positive, odd integer");
            userNum= keyedInput.nextInt();
            
            remainder = userNum %2; 
            
            if(remainder==1)
            {
                valid =true;
            }
            else
            {
                System.out.println("Please enter an odd integer");
            }
        }
    }
    
}
