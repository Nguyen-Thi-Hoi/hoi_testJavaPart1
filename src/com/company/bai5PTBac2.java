package com.company;

import java.util.Scanner;

             /* ax^2 + bx + c = 0 */
public class bai5PTBac2 {
    public static void main(String args []){
        Scanner n = new Scanner(System.in);

        System.out.print("Nhập a: ");
        double a = n.nextFloat();
        System.out.print("Nhập b: ");
        double b = n.nextFloat();
        System.out.print("Nhập c: ");
        double c = n.nextFloat();

        if(a != 0){
            double delta = b * b - 4 * a * c;
            if ( delta < 0 ){
                System.out.println("Phương trình vô nghiệm");
            }
            else if ( delta > 0 )
            {
                System.out.println("Phương trình có 2 nghiệm: ");
                System.out.println("x1 = " + ((-b) + Math.sqrt(delta)) / (2*a));
                System.out.println("x2 = " + ((-b) - Math.sqrt(delta)) / (2*a));
            }
        }else {
            System.out.println("Phương trình có nghiệm kép x1 = x2 = " + (-b) / (2*a));
        }
    }
}
