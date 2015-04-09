public class TestLaptop{
	public static void main(String[] args) {
		
		laptop ku = new laptop();
		laptop mu = new laptop("dell","hitam");
		laptop nya = new laptop("acer","hitam","tidak terhubung");
		laptop mereka = new laptop("asus","putih","terhubung",56);

		ku.menyala();
		System.out.println(" merk : " +ku.getmerk()+ " warna : " +ku.getwarna()+ " wifi : " +ku.getwifi()+ " baterai : " +ku.getbaterai() );
		ku.mati();

		System.out.println(" ");
		mu.menyala();
		mu.setwifi("terhubung");
		mu.setbaterai(4);
		System.out.println(" merk : " +mu.getmerk()+ " warna : " +mu.getwarna()+ " wifi : " +mu.getwifi()+ " baterai : " +mu.getbaterai() );

		System.out.println(" ");
		nya.menyala();
		nya.setwifi("tidak terhubung");
		nya.setbaterai(56);
		System.out.println(" merk : " +nya.getmerk()+ " warna : " +nya.getwarna()+ " wifi : " +nya.getwifi()+ " baterai : " +nya.getbaterai() );

		System.out.println(" ");
		mereka.menyala();
		System.out.println(" merk : " +mereka.getmerk()+ " warna : " +mereka.getwarna()+ " wifi : " +mereka.getwifi()+ " baterai : " +mereka.getbaterai() );
		mereka.mati();

	}
	
}