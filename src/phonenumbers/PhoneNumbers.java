/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonenumbers;

import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author ivasquez
 */
public class PhoneNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a phone number:");
        String pNumberIn = sc.next();
        
        Pattern digits = Pattern.compile("([(]?)([0-9]{3})([)]?[.]?[-]?)([0-9]{3})([-]?[.]?)([0-9]{4})");
        
        Matcher check = digits.matcher(pNumberIn);
        if(check.matches())
        {
            String F = check.group(2);
            String S = check.group(4);
            String T = check.group(6);
            System.out.println("your phone number is: " + "(" + F + ")" + S + "-" + T);
        }
        else
        {
            System.out.println("ERROR: Please enter a valid phone number");
            
        }
        
        
        
    }
    
}
