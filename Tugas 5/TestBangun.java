class TestBangun
{
	public static void main(String[] args) 
	{
		
		Lingkaran bangundua = new Lingkaran();
		
		bangundua.r = 4;
						
		bangundua.cetakKeLayar();

		System.out.println("Luas: " + bangundua.hitungLuas());
		System.out.println("Keliling: " + bangundua.hitungKeliling());

		bangundua.ubahProperty(14);
		
		System.out.println("Property baru:");
		bangundua.cetakKeLayar();		

		System.out.println("Luas baru: " + bangundua.hitungLuas());
		System.out.println("Keliling: " + bangundua.hitungKeliling());
		


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