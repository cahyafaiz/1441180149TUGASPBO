public class laptop {
	private String merk;
	private String warna;
	private String wifi;
	private int baterai;

	public laptop()
	{
		merk	= "Toshiba";
		warna	= "Hitam";
		wifi	= "Terhubug";
		baterai	= 50;
	}

	public laptop(String merkInput, String warnaInput)
	{
		merk 	= merkInput;
		warna  	= warnaInput;
	}

	public laptop(String merkInput, String warnaInput, String wifiInput)
	{
		merk	= merkInput;
		warna	= warnaInput;
		wifi	= wifiInput;
	}
	public laptop(String merkInput, String warnaInput, String wifiInput, int bateraiInput)
	{
		merk 	= merkInput;
		warna 	= warnaInput;
		wifi 	= wifiInput;
		baterai = bateraiInput;
	}

	public void menyala()
	{
		System.out.println("Welcaome to Laptop");
	}

	
	public void mati()	
	
	{
		System.out.println("Thankyou have a nce day");
	}

	public void indikatorbaterai()
	{
		System.out.println("Baterai tinggal : "+ baterai+ "%");
	}
	
	public void indikatorwifi()
	{
		System.out.println("wifinya :" +wifi);
	}

	public String getmerk()
	{
		return merk;
	}
	public String getwarna()
	{
		return warna;
	}
	public int getbaterai()
	{
		return baterai;
	}
	public String getwifi()
	{
		return wifi;
	}
	
	public void setmerk(String m)
	{
		merk = m;
	}
	public void setwarna(String c)
	{
		warna = c;
	}
	public void setbaterai(int b)
	{
		baterai = b;
	}
	public void setwifi(String w)
	{
		wifi = w;
	}

}