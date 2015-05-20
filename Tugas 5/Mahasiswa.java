class Mahasiswa {


	private String nama;
	private int umur;

	public Mahasiswa(){

		nama = " Ridwan Rismanto ";
		umur = 20;
	}

	public Mahasiswa( String n, int a ) {
	
	nama = n;
	umur = a;
	
	}

	public String getNama()
	{

		return nama;
	}

	
	public int getUmur()
	{

		return umur;
	}


	public void setUmur(int a){

		umur = a;
	}

	public void tampilkanBiodata()
	{

		System.out.println(" : : : B I O D A T A : : : ");
		System.out.println(" Nama : " +getNama() );
		System.out.println(" Umur : " +getUmur());
		
	}
}