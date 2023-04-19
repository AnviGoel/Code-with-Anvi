/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package start;
import java.util.*;
import java.io.*;
import java.lang.System;
/**
 *
 * @author Admin
 */
public class arithmaticop {
    public static void main(String[] args) {

        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("the sum is "+(a+b));
        System.out.println("the difference is "+(a-b));
        System.out.println("the multiply is "+(a*b));
        System.out.println("the div is "+(a/b));
        System.out.println("the remainder is "+(a%b));
    }

}
