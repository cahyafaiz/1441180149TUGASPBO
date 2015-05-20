public class TestLingkaran
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
	
	}
}
