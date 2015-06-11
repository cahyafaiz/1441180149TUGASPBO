package com.company;


public class Senjata {

    private String namaSenjata;
    private String bentukSenjata;
    private String elemenSenjata;
    private int physattackSenjata;
    private int magicattackSenjata;

    public Senjata() {
    }

    public Senjata(String namaSenjata, String bentukSenjata, String elemenSenjata, int physattackSenjata, int magicattackSenjata) {
        this.namaSenjata = namaSenjata;
        this.bentukSenjata = bentukSenjata;
        this.elemenSenjata = elemenSenjata;
        this.physattackSenjata = physattackSenjata;
        this.magicattackSenjata = magicattackSenjata;
    }

    public String getNamaSenjata() {
        return namaSenjata;
    }

    public void setNamaSenjata(String namaSenjata) {
        this.namaSenjata = namaSenjata;
    }

    public String getBentukSenjata() {
        return bentukSenjata;
    }

    public void setBentukSenjata(String bentukSenjata) {
        this.bentukSenjata = bentukSenjata;
    }

    public String getElemenSenjata() {
        return elemenSenjata;
    }

    public void setElemenSenjata(String elemenSenjata) {
        this.elemenSenjata = elemenSenjata;
    }

    public int getPhysattackSenjata() {
        return physattackSenjata;
    }

    public void setPhysattackSenjata(int physattackSenjata) {
        this.physattackSenjata = physattackSenjata;
    }

    public int getMagicattackSenjata() {
        return magicattackSenjata;
    }

    public void setMagicattackSenjata(int magicattackSenjata) {
        this.magicattackSenjata = magicattackSenjata;
    }

    @Override
    public String toString() {
        return "Senjata{" +
                "namaSenjata='" + namaSenjata + '\'' +
                ", bentukSenjata='" + bentukSenjata + '\'' +
                ", elemenSenjata='" + elemenSenjata + '\'' +
                ", physattackSenjata=" + physattackSenjata +
                ", magicattackSenjata=" + magicattackSenjata +
                '}';
    }
}
