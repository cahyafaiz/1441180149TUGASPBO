class TestMobil {

	public static void main(String[] args) {
		
		Mobil Hanzo = new Mobil();
		Mobil Jaeger = new Mobil(140,"Di parkiranku");

		Jaeger.setNomerplat(" N 1603 NN ");


		
		System.out.println("Hanzo :\nKecepatan\t: "+Hanzo.getKecepatan()+"Km/hour"+"\nPosisi\t\t: "+Hanzo.getPosisi()+"\nNomor Plat\t: "+Hanzo.getNomerplat()+"\nMerk\t\t: "+Hanzo.getMerek()+"\nWarna\t\t: "+Hanzo.getWarna()+"\nMesin\t\t: "+Hanzo.getMesin());

		

		System.out.println("Jaeger :\nKecepatan\t: "+Jaeger.getKecepatan()+"Km/hour"+"\nPosisi\t\t: "+Jaeger.getPosisi()+"\nNomor Plat\t: "+Jaeger.getNomerplat()+"\nMerk\t\t: "+Jaeger.getMerek()+"\nWarna\t\t: "+Jaeger.getWarna()+"\nMesin\t\t: "+Jaeger.getMesin());

		

		System.out.println("Setelah Kecelakaan: ");

		

		Hanzo.setKecepatan(14);Hanzo.setMesin(" Kurcaci Tempur ");Hanzo.setWarna(" Hitam ");
	
		

		System.out.println("Hanzo :\nKecepatan\t: "+Hanzo.getKecepatan()+"Km/hour"+"\nPosisi\t\t: "+Hanzo.getPosisi()+"\nNomor Plat\t: "+Hanzo.getNomerplat()+"\nMerk\t\t: "+Hanzo.getMerek()+"\nWarna\t\t: "+Hanzo.getWarna()+"\nMesin\t\t: "+Hanzo.getMesin());


	}
	
}