package com.company;


public class TestChar {

    public static void main(String[] args) {

        Character Elesis = new Character("Elesis","Velder Village",'P',"Hidup",18);
        System.out.println(Elesis.getNamaCharacter());
        System.out.println(Elesis.getAsalCharcter());
        System.out.println(Elesis.getJenisKelaminCharacter());
        System.out.println(Elesis.getStatusCharcter());
        System.out.println(Elesis.getUmurCharcter());

        Senjata SalvatoreSolace = new Senjata("Salvatore Solace","Long Sword","Api",9999,7500);
        System.out.println("=-=-=-=-=-=-=-=-=");
        System.out.println(SalvatoreSolace.getNamaSenjata());
        System.out.println(SalvatoreSolace.getBentukSenjata());
        System.out.println(SalvatoreSolace.getElemenSenjata());
        System.out.println(SalvatoreSolace.getPhysattackSenjata());
        System.out.println(SalvatoreSolace.getMagicattackSenjata());
    }
}
