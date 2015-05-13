public class circle {
		// variable radius dan color 
		// radius -> double
		// color -> string

		private double radius;
		private String color;

		public circle(){

			radius = 4.0;
			color = "yellow";
		}

		public circle(double r){

			radius = r;
			color = "red";
		}

		public circle(double r, String c){

			radius = r;
			color = c;
		}

		public double getRadius(){

			return radius;
		}
	
		public String getColor(){

			return color;
		}

		public double getArea(){

			return radius*radius*Math.PI;
		}	

		public void setColor(String c){
			color = c;
		}

		public void setRadius(double R){
			radius = r;
		}
}
