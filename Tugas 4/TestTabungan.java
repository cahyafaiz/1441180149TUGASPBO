import java.util.Scanner;

class TestTabungan {
	
	public static void main(String[] args) {
		int simpanan;

		Tabungan Ayahku = new Tabungan();


		Scanner Ibuku = new Scanner(System.in);

		Ayahku.setSimpanan(140000);
		
		System.out.print("Selamat datang di BanK AkaToShiro");
		System.out.println("Data anda:\n Nama: "+Ayahku.getPemilik()+"\tNorek: "+Ayahku.getNomerrekening());
		System.out.println("Silakan pilih satu,\n dari berberapa menu yang tersedia:");
		System.out.println( "1.Tabung ");
		System.out.println( "2.Penarikan ");
		System.out.println( "3.Transfer ");
		System.out.println( "4.Dana yang anda terima ");
		System.out.println( "5.Check saldo ");
		

		System.out.print("1 - 5: ");
		int p = Ibuku.nextInt();

		switch (p) {

			case 1 :
			System.out.println( " Silakan masukan jumlah yang ingin anda Celengi: " );
			int menabung = Ibuku.nextInt();
			Ayahku.menabung(menabung);
			Ayahku.ceksaldo();
			break;
			case 2 :
			System.out.println( "Silakan masukan jumlah yang akan anda tarik: " );
			int tarik = Ibuku.nextInt();
			Ayahku.tarik(tarik);
			Ayahku.ceksaldo();
			break;

			case 3 :
			System.out.println( "Silakan masukan jumlah yang akan anda transfer: " );
			int transfer = Ibuku.nextInt();
			Ayahku.transfer(transfer);
			Ayahku.ceksaldo();
			break;

			case 4 : 
			Ayahku.terima();
			break;

			case 5 :
			Ayahku.ceksaldo();
			break;




			default:

			System.out.print( " Silakan masukan angka 1 - 5" );

			
		}



	}
}