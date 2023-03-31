package com.myself.main;

import java.util.Scanner;

public class TestThree {
    public static void main(String[] args) {
        int x = 1, y = 1, z;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jumlah bilangan fibonacci = ");
        int jumlah = input.nextInt();

        for (int i = 0; i < jumlah; i++){
            System.out.print(x + " ");
            z = x + y;
            x = y;
            y = z;
        }
    }
}
