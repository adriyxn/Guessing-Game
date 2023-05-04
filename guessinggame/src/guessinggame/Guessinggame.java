/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;
import javax.swing.*;
/**
 *
 * @author Adriyan
 */
public class Guessinggame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int randomnumber = (int) (Math.random() * 100 + 1);
        System.out.println(randomnumber);
        int usernumber = 0;
        int count = 1;
        
        
        
        while(usernumber != randomnumber)
        {
                String response = JOptionPane.showInputDialog(null, "Enter a number to guess", "");
                usernumber = Integer.parseInt(response);
                JOptionPane.showMessageDialog(null,  determineGuess(usernumber, randomnumber, count));
                count++;
        }
                
       
    }
    
    public static String determineGuess(int usernumber, int randomnumber, int count){
        if (usernumber > 100 || usernumber <0)
        {
            return "Value is invalid";
        
        } 
        
        else if (usernumber == randomnumber)
        {
            return "Correct! \n Total Guesses: " + count;
            
        }
        
        else if (usernumber > randomnumber )
        {
            return "Your guess is too high. \n Tries: " + count;
            
        }
        
        else if (usernumber < randomnumber )
        {
            return "Your guess is too low. \n Tries: " + count;
        }else {
            return "Your guess is incorrect." + count;
        }
        
       
   }
}
    

