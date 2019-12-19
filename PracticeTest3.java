/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicetest3;

/**
 *
 * @author mrseay
 */
import java.util.*;
public class PracticeTest3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        final String inputString = "sidney seay";

        final String reversed = reverseString(inputString);
        System.out.println("The reversed string is " + reversed);

    }

    public static String reverseString(String originalString) {
        Stack<Character> stack = new Stack<>();
        String reversed = "";
        for (int i = 0; i < originalString.length(); i++) {
            char ch = originalString.charAt(i);
            stack.push(ch);
        }
        for (int i = 0; i < originalString.length(); i++) {
            char ch = stack.pop();
            reversed = reversed + ch;

        }
        return reversed;

    }

}
