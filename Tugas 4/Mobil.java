class Mobil {

	private int kecepatan;
	private String posisi;
	private String nomerplat;
	private String merek;
	private String warna;
	private String mesin;
	public int maxspeed = 400;

	public Mobil(){

		kecepatan = 240;
		posisi = " Diparkiran ";
		nomerplat = " N 4040 NN ";
		merek = " Hanzo ";
		warna = " Merah ";
		mesin = " Belalang Tempur ";
	}
	public Mobil(int kecepatanInput, String posisiInput){

		kecepatan = kecepatanInput;
		posisi = posisiInput;
		nomerplat = " N 4040 NN ";
		merek = " Hanzo ";
		warna = " Merah ";
		mesin = " Belalang Tempur ";
	}
	public Mobil(int kecepatanInput, String posisiInput, String nomerplatInput){

		kecepatan = kecepatanInput;
		posisi = posisiInput;
		nomerplat = nomerplatInput;
		merek = " Hanzo ";
		warna = " Merah ";
		mesin = " Belalang Tempur ";
	}
	public Mobil(int kecepatanInput, String posisiInput, String nomerplatInput, String merekInput){

		kecepatan = kecepatanInput;
		posisi = posisiInput;
		nomerplat = nomerplatInput;
		merek = merekInput;
		warna = " Merah ";
		mesin = " Belalang Tempur ";
	}
	public Mobil(int kecepatanInput, String posisiInput, String nomerplatInput, String merekInput, String warnaInput){

		kecepatan = kecepatanInput;
		posisi = posisiInput;
		nomerplat = nomerplatInput;
		merek = merekInput;
		warna = warnaInput;
		mesin = " Belalang Tempur ";
	}
	public Mobil(int kecepatanInput, String posisiInput, String nomerplatInput, String merekInput, String warnaInput, String mesinInput){

		kecepatan = kecepatanInput;
		posisi = posisiInput;
		nomerplat = nomerplatInput;
		merek = merekInput;
		warna = warnaInput;
		mesin = mesinInput;
	}

	public void maju(){

		kecepatan++;
	}

	public void berhenti(){

		kecepatan = 0;
	}

	public void ngebut(){

		kecepatan = maxspeed;
	}

	public void ngerem(){

		kecepatan--;
	}

	public int getKecepatan(){
		return kecepatan;
	}

	public String getPosisi(){
		return posisi;
	}

	public String getNomerplat(){
		return nomerplat;
	}

	public String getMerek(){
		return merek;
	}

	public String getWarna(){
		return warna;
	}

	public String getMesin(){
		return mesin;
	}



	public int setKecepatan( int kecepatan ){

			return this.kecepatan = kecepatan;

	}

	public String setPosisi( String posisi ){

			return this.posisi = posisi;
	}

	public String setNomerplat( String nomerplat ){

			return this.nomerplat = nomerplat;
	}

	public String setMerek( String merek ){

			return this.merek = merek;
	}

	public String setWarna( String warna ){

			return this.warna = warna;
	}

	public String setMesin( String mesin){

			return this.mesin = mesin;
	}
}