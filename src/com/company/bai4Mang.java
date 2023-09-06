package com.company;

public class bai4Mang {
    public static void main(String args []){

        int[] arr = {2,7,6,8,9,21,34,56,32,12,37};
        /* Tìm phần tử lớn nhất trong mảng và in ra thông tin*/
        int max = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là: "+ max);

        /* Tính tổng số đầu tiên và số cuối cùng */
         int sum = 0;
         for (int k = 0; k < arr.length; k++){
             sum = arr[0] + arr[arr.length - 1];
         }
        System.out.println("Tổng số đầu tiên và số cuối cùng là: " + sum);

        /* Tính tổng các số chẵn trong mảng*/
        int tongSoChan = 0;
        for(int j = 0; j < arr.length; j++){
            if(arr[j] %2 == 0){
                tongSoChan = tongSoChan + arr[j];
            }
        }
        System.out.println("Tổng các số chẵn trong mảng: " + tongSoChan);
    }
}
