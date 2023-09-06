package com.company;


import java.util.Scanner;

/* Người dùng nhập vào 1 mảng số N và yêu cầu in ra các số sau:
                  * Danh sách số lẻ
                  * Danh sách số chẵn
                  * In ra dãy số nguyên tố có trong N
                  * In ra dãy fibonacci có trong N */
public class bai3 {
    public static void main(String args []){

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử: ");
        int number = sc.nextInt();

        /* Khai báo mảng có độ dài nhập từ bàn phím */
        int[] mangSoNguyen = new int[number];
        System.out.println("Nhập giá trị mảng: ");

        /* Duyệt số lần nhập số phần tử của mảng */
        for(int i = 0; i < number ; i++){
            System.out.print("a["+ i +"]" + " = ");
            mangSoNguyen[i] = sc.nextInt();
        }
        // Duyệt mảng
        /* in ra số lẻ*/
        System.out.print("Số lẻ là: ");
        for (int i = 0; i < number; i++) {
            if (mangSoNguyen[i] % 2 == 1) {
                System.out.print(mangSoNguyen[i] + " ");
            }
        }
       /* in ra số chẵn */
        System.out.println();
        System.out.print("Số chẵn là: ");
        for (int j = 0; j < mangSoNguyen.length; j++){
            if( mangSoNguyen[j] % 2 == 0){
               System.out.print(mangSoNguyen[j] + " ");
            }
        }
        /* in ra số nguyên tố
                              NGÂM CỨU SAU NHA THẦY
        in ra số fibonacci */
}
}

