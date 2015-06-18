package com.company;

/**
 * Created by DELL on 6/17/2015.
 */
public class TestUnit {

    public static void main(String[] args) {

//        buat objek rekening

        Rekening ca = new Rekening(40000.0);
        Nasabah gm = new Nasabah("Basuki");

        System.out.printf(gm.toString());
        gm.setTabungan(ca);
        System.out.println(gm.toString());
        ca.Tarik(10000.0);
        System.out.println(ca.toString());
        System.out.println(gm.toString());
        ca.Setor(50000.0);
        System.out.println(ca.toString());
        System.out.println(gm.toString());
    }
}
//  tarik saldo sebesar 10jt
//  tampilkan saldo sekarang
//  setor saldo sebesar 5jt
//  tampilkan saldo sekarang