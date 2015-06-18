package com.company;

/**
 * Created by DELL on 6/17/2015.
 */
public class Rekening {

    private double saldo;

    public Rekening(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void Tarik(Double nominal){

        saldo = saldo - nominal;
    }

    public void Setor(Double nominal){

        saldo = saldo + nominal;
    }


    @Override
    public String toString() {
        return "Rekening{" +
                "saldo=" + saldo +
                '}';
    }
}
