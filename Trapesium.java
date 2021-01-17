package com.company;

import java.util.Scanner;

public class Trapesium implements Operasi{

    private int r1;
    private int r2;
    private int t ;
    private int s ;


    public Trapesium(){}
    public void Trapesium(){

        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("=====Calculator Menghitung Luas dan Keliling Trapesium=====");
        System.out.print("Masukan Panjang Garis Atas : ");
        r1 = input.nextInt();
        System.out.print("Masukan Panjang Garis Alas : ");
        r2 = input.nextInt();
        System.out.print("Masukan tinggi : ");
        t = input.nextInt();
        System.out.print("Masukan Panjang Sisi Miring : ");
        s = input.nextInt();


        System.out.println();
        System.out.println("Pilih Rumus");
        System.out.println("1. Cari Luas");
        System.out.println("2. Cari Keliling");
        System.out.print("Masukan Pilihan : ");
        int pilih = input.nextInt();

        switch (pilih){
            case 1:{
                System.out.println("Luas Trapesium : "+luas());
                break;
            }
            case 2:{
                System.out.println("Keliling Trapesium : "+keliling());
                break;
            }
        }
    }

    @Override
    public float luas() {
        return (r1+r2)/2*t;
    }
    @Override
    public float keliling() {
        return r1+r2+t+s;
    }
}
