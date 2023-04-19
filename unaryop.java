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
public class unaryop {
    public static void main(String[] args) {
        int a,b,c,d;
        System.out.println("enter four numbers");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        a++;
        c= --a+ ++b;
        d=c++ -  ++a;
        b=++a- ++c;
        a=--c + ++d;
        System.out.println("a is "+a);
        System.out.println("b is "+b);
        System.out.println("c is "+c);
        System.out.println("d is "+d);

    }
}
