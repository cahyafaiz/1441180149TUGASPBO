public class TestMethodOverloading {
	public static int average(int nsatu, int ndua){ 
		return (nsatu+ndua)/2;
	}

	public static double average(double nsatu, double ndua){
		return (nsatu+ndua)/2;
	}
	
	public static int average(int nsatu, int ndua, int ntiga){
		return (nsatu+ndua+ntiga)/3;
	}

	public static void main(String[] args) {
		System.out.println(average(1, 2));
		System.out.println(average(1.0, 2.0));
		System.out.println(average(1, 2, 3));
		System.out.println(average(1.0, 2));
		
	}
}
