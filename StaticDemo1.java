// static keyword 
// static instance variable/data member
// static block
// static method
// static inner class(inner class)
// static import

import java.util.*;
import static java.lang.System.out;

import static java.lang.Math.*; //example of static import and through this the methods can be called without writing Math.xyz;

public class StaticDemo1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("This is static import example.");

        //called static methods of the maths class
        out.println(pow(2,10)); //instead of Math.pow();
        out.println(abs(-456));
        out.println(floor(24.234));
        out.println(ceil(24.234));

        out.println("This is the static import");

        sc.close();
    }
}