package com.company;

/**
 * Created by DELL on 6/17/2015.
 */
public class Nasabah {

    private String namaNasabah;
    private Rekening Tabungan;

    public Nasabah(String namaNasabah) {
        this.namaNasabah = namaNasabah;
    }

    public Nasabah(String namaNasabah, Rekening tabungan) {
        this.namaNasabah = namaNasabah;
        Tabungan = tabungan;
    }

    public String getNamaNasabah() {
        return namaNasabah;
    }

    public void setNamaNasabah(String namaNasabah) {
        this.namaNasabah = namaNasabah;
    }

    public Rekening getTabungan() {
        return Tabungan;
    }

    public void setTabungan(Rekening tabungan) {
        Tabungan = tabungan;
    }

    @Override
    public String toString() {
        return "Nasabah{" +
                "namaNasabah='" + namaNasabah + '\'' +
                ", Tabungan=" + Tabungan +
                '}';
    }
}
