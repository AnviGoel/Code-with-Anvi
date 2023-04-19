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
public class conditionalop {
    public static void main(String[] args) {
        int a,b,ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("which program you want to perform");
        System.out.println("1.even odd 2.leap year 3.positive negative 4.pass fail");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("enter a");
            Scanner scann=new Scanner(System.in);
            a=scann.nextInt();
            System.out.println("enter b");
            b=sc.nextInt();
             if(a%2==0 && b%2==0)
             {

                 System.out.println("a is even and b is even");
             }
             else
             if(a%2==0 && b%2!=0)
             {
                 System.out.println("a is even and b is odd");
             }
             else
             if(a%2!=0 && b%2==0)
             {
                 System.out.println("a is even and b is odd");
             }
             else
             if(a%2!=0 && b%2!=0)
             {
                 System.out.println("a is odd and b is odd");
             }
             

            case 2:

                System.out.println("enter a");
                Scanner scan=new Scanner(System.in);
                a=scan.nextInt();

                if(a%4==0 && a%100!=0 || a%400==0)
                {
                    System.out.println("leap year");
                }
                else
                {
                    System.out.println("not a leap year");
                }
                

            case 3:
                System.out.println("enter a");
                Scanner sca=new Scanner(System.in);
                a=sca.nextInt();
                if(a>0)
                {
                    System.out.println("number is positive");
                }
                else
                if(a==0)
                {
                    System.out.println("a is null");
                }
                else
                {
                    System.out.println("a is negative");
                }
                

            case 4:
                System.out.println("enter marks scored");
                Scanner s=new Scanner(System.in);
                a=s.nextInt();
                if(a>=40)
                {
                    System.out.println("pass");
                }
                else
                {
                    System.out.println("fail");
                }
                break;

                }

        }

    }
