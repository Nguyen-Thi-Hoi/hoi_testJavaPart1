package com.company;

import java.util.Scanner;
          /* Bài 2: Nhập số N (2<= N <=20) và in ra bảng cửu chương với số N.
                    Bảng cửu chương sẽ bắt đầu từ 1 và kết thúc là 10 */
public class bai2 {
    public static void main(String args []){

        Scanner n = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int number = n.nextInt();
        if(number >= 2 && number <= 20){
            for(int i=1; i <=10; i++){
                int ketqua = number*i;
                System.out.printf("%d x %d = %d \n",number,i,ketqua);
            }
        }else{
            System.out.println("Nhập sai số");
        }
    }
}

