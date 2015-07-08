package Liga;

/**
 * Created by DELL on 6/24/2015.
 */
public class Main {

    public static void main(String[] args) {

        Liga Japan = new Liga("Japan");

        Divisi JapLeague1 = new Divisi("Jap League 1");
        Divisi JapLeague2 = new Divisi("Jap League 2");

        Klub Satu1 = new Klub("Inazuma Eleven", JapLeague1, Japan);
        Klub Satu2 = new Klub("Nankatsu", JapLeague1, Japan);
        Klub dua1 = new Klub("Kirisaki Daiichi", JapLeague2, Japan);
        Klub dua2 = new Klub("Asahigaoka", JapLeague2, Japan);


        Japan.setDaftarDivisi(JapLeague1);
        Japan.setDaftarDivisi(JapLeague1);


        Japan.setDaftarKlub(Satu1);
        Japan.setDaftarKlub(Satu2);
        Japan.setDaftarKlub(dua1);
        Japan.setDaftarKlub(dua2);

        JapLeague1.setDaftarKlub(Satu1);
        JapLeague1.setDaftarKlub(dua2);
        JapLeague2.setDaftarKlub(dua1);
        JapLeague2.setDaftarKlub(dua2);

        System.out.println("Liga : " +Japan.getNamaLiga());
        System.out.println("Klub ; " +Japan.getDaftarKlub());

        System.out.println("\n");

        System.out.println("Liga : " +Japan.getNamaLiga());
        System.out.println("Klub : " +Japan.getDaftarKlub());
        System.out.println("\n");

        System.out.println("Liga : " +Japan.getNamaLiga());
        System.out.println("Klub : " +JapLeague1.getDaftarKlub());
        System.out.println("\n");


        System.out.println("Liga : " +Satu1.getLiga());
        System.out.println("Klub : " +Satu1.getNamaKlub());
        System.out.println("Divisi : " +Satu1.getDivisi());
        System.out.println("\n");

        System.out.println("Liga : " +dua2.getLiga());
        System.out.println("Klub : " +dua2.getNamaKlub());
        System.out.println("Divisi : " +dua2.getDivisi());
        System.out.println("\n");




    }
}
