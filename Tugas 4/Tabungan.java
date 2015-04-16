

class  Tabungan {
	

	private int simpanan;
	private String pemilik;
	private int nomerrekening;
	private double bunga;
	private double jumlah;


	public Tabungan(){

		simpanan 	= 140000;
		pemilik		= " Ayahku ";
		nomerrekening	= 1504196570;
		bunga		= 4;
	}

	public Tabungan( int simpananInput ){

		simpanan 	= simpananInput;
		pemilik		= " Ayahku ";
		nomerrekening	= 1504196570;
		bunga		= 4;
	}

	public Tabungan(int simpananInput, String pemilikInput){

		simpanan 	= simpananInput;
		pemilik		= pemilikInput;
		nomerrekening		= 1504196570;
		bunga		= 4;
	}

	public Tabungan(int simpananInput, String pemilikInput,int nomerrekInput){

		simpanan 	= simpananInput;
		pemilik		= pemilikInput;
		nomerrekening	= nomerrekening;
		bunga		= 4;
	}

	public void menabung(int menabung){

		simpanan = simpanan + menabung;
	}
	
	public void tarik(int tarik){

		simpanan = simpanan - tarik; 
	}

	public void transfer(int transfer){

		transfer = simpanan - transfer; 
	}


	int r = (int) (Math.random() * 444.000);
	public void terima(){

		simpanan = simpanan + r;
		System.out.print(" Jumlah yang anda terima: "+simpanan);
	}

	
	public void ceksaldo(){

		System.out.println("Saldo anda saat ini :"+simpanan);
	}


	public int getSimpanan(){

		return simpanan;
	}

	public String getPemilik(){

		return pemilik;
	}

	public int getNomerrekening(){

		return nomerrekening;
	}



	public int setSimpanan(int simpanan){

		return this.simpanan = simpanan;
	}
	
	public String setPemililk(String pemilik){

		return this.pemilik = pemilik;
	}
	
	public int setNomerrekening(int nomerrekening){

		return this.nomerrekening = nomerrekening;
	}
}
	
