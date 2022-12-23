package equations;

public class Equations {
	public double width, height;
	
	public double Area() {
		return width * height;
	}
	
	public double Perimeter() {
		return (2*width) + (2*height);
	}
	
	public double Diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	
	public String toString () {
		return "AREA: " + Area() + ", PERIMETER: "+ Perimeter() +", DIAGONAL: "+ Diagonal();
	}
}
