package geometry;

public class Donut extends Circle {
	private int innerRadius;

	public Donut() {

	}

	public Donut(Point center, int r, int innerRadius) {
		super(center, r);
		this.innerRadius = innerRadius;
	}

	public Donut(Point center, int r, int innerRadius, boolean selected) {
		this(center, r, innerRadius);
		this.selected = selected;
	}

	@Override
	public boolean contains(int x, int y) {
		return super.contains(x, y) && center.distance(x, y) >= innerRadius;
	}

	@Override
	public boolean contains(Point p) {
		return this.contains(p.getX(), p.getY());
	}

	@Override
	public double area() {
		return super.area() - innerRadius * innerRadius * Math.PI;
	}

	@Override
	// Center:(xCenter,yCenter), radius = <radius>, inner radius = <radius>
	public String toString() {
		return super.toString() + ", inner radius = " + innerRadius;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Donut) {
			/*Donut temp = (Donut) obj;
			if (center.equals(temp.center) && innerR == temp.innerR && r == temp.r) {
				return true;
			}*/

			Donut temp = (Donut) obj;
			if (super.equals(new Circle(temp.center, temp.radius)) && innerRadius == temp.innerRadius) {
				return true;
			}
		}
		return false;
	}

	public int getInnerR() {
		return innerRadius;
	}

	public void setInnerR(int innerR) {
		this.innerRadius = innerR;
	}
}