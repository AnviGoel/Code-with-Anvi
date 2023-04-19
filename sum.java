/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package start;
import java.util.*;
import java.io.*;
import java.lang.System;
/**
 *123
 * @author Admin
 */
public class sum {
    public static void main(String[] args) {

        int a,b,c,num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        num=sc.nextInt();
        a=num/10;
        b=a%10;
        a=a/10;
        c=a%10;
        System.out.println("the sum of two middle digits in a 4-digite number is "+(b+c));

    }

}
