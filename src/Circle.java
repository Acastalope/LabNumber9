import java.text.DecimalFormat;

public class Circle {
	private double radius;

	public Circle () {

	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getCircumference(double radius) {
		return 2 * radius * Math.PI;
	}
	public String getFormattedCircumference(double radius) {
		return formatNumber(getCircumfeence(radius));
	}
	public double getArea(double radius) {

		return radius * radius * Math.PI; 
	}
	public String formattedArea() {
		return formatNumber(getArea(radius));
	}
	private String formattedNumber(double x) {
		double radius = sc.nextInt();

	}

}
