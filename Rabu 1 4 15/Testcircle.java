public class Testcircle{
	public static void main(String[] args) {
		
		circle gaoren = new circle();
		circle elesis = new circle(30);
		System.out.println("radius = "+ gaoren.radius +" color = "+ gaoren.color + " Luas ="+ gaoren.getArea());
		System.out.println("radius = "+ elesis.radius +" color = "+ elesis.color + " Luas ="+ elesis.getArea()); 
	}
	
}