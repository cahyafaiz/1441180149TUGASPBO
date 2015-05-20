public class TestSegitiga
{

	public static void main(String[] args)
	{
		
		Segitiga bangunsatu = new Segitiga();
		
		bangunsatu.alas = 4;
		bangunsatu.tinggi = 14;
				
		bangunsatu.cetakKeLayar();

		System.out.println("Luas: " + bangunsatu.hitungLuas());
		System.out.println("Keliling: " + bangunsatu.hitungKeliling());

		bangunsatu.ubahProperty(23, 24);
		
		System.out.println("Property baru:");
		bangunsatu.cetakKeLayar();		

		System.out.println("Luas baru: " + bangunsatu.hitungLuas());
		System.out.println("Keliling: " + bangunsatu.hitungKeliling());
	
	}
}
