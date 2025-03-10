/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[]args){
        Scanner scanner = new
            Scanner(System.in);
        
        System.out.print("enter a world:");
        String original = scanner.nextLine();
        
       
        String reversed = "";
        for (int i = original.length()- 1;i >=0;i--){
            reversed += original.charAt(i);
          
        }
        
        if (original.equalsIgnoreCase(reversed))
        {
            System.out.print("the world is a palindrom.");
      
                    }else{
            System.out.println("the world is NOT a palindrom.");
        }
        scanner.close();
    }
}
