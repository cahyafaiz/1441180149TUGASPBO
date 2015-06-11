package com.company;

public class Character {

    private String namaCharacter;
    private String asalCharcter;
    private char jenisKelaminCharacter;
    private String statusCharcter;
    private int umurCharcter;

    public Character() {
    }

    public Character(String namaCharacter, String asalCharcter, char jenisKelaminCharacter, String statusCharcter, int umurCharcter) {
        this.namaCharacter = namaCharacter;
        this.asalCharcter = asalCharcter;
        this.jenisKelaminCharacter = jenisKelaminCharacter;
        this.statusCharcter = statusCharcter;
        this.umurCharcter = umurCharcter;
    }

    public String getNamaCharacter() {
        return namaCharacter;
    }

    public void setNamaCharacter(String namaCharacter) {
        this.namaCharacter = namaCharacter;
    }

    public String getAsalCharcter() {
        return asalCharcter;
    }

    public void setAsalCharcter(String asalCharcter) {
        this.asalCharcter = asalCharcter;
    }

    public char getJenisKelaminCharacter() {
        return jenisKelaminCharacter;
    }

    public void setJenisKelaminCharacter(char jenisKelaminCharacter) {
        this.jenisKelaminCharacter = jenisKelaminCharacter;
    }

    public String getStatusCharcter() {
        return statusCharcter;
    }

    public void setStatusCharcter(String statusCharcter) {
        this.statusCharcter = statusCharcter;
    }

    public int getUmurCharcter() {
        return umurCharcter;
    }

    public void setUmurCharcter(int umurCharcter) {
        this.umurCharcter = umurCharcter;
    }

    @Override
    public String toString() {
        return "Character{" +
                "namaCharacter='" + namaCharacter + '\'' +
                ", asalCharcter='" + asalCharcter + '\'' +
                ", jenisKelaminCharacter=" + jenisKelaminCharacter +
                ", statusCharcter='" + statusCharcter + '\'' +
                ", umurCharcter=" + umurCharcter +
                '}';
    }
}
