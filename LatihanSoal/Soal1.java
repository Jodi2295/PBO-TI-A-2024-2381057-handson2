package LatihanSoal;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        int[] bilangan = new int[2];
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan bilangan  pertama : ");
        bilangan[0] = input.nextInt();
        System.out.println("Masukkan bilangan kedua : ");
        bilangan[1] = input.nextInt();

        if(bilangan[1] > bilangan[0]){
            System.out.println(bilangan[1]);

        }else{
            System.out.println(bilangan[0]);
        }
    }
}
