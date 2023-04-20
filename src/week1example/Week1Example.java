/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week1example;

import java.util.Scanner;

public class Week1Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Week 1");
        Scanner in = new Scanner(System.in);
        String word = in.next();
        //step 2. split char and store in array
        char[] reverse = new char[word.length()];
        for(int i=0;i<word.length();i++)
        {
            reverse[i] =word.charAt(i);
        }
        for(int i=reverse.length-1;i>=0;i--)
        {
            System.out.print(reverse[i]);
        }
    }
    
}
