package geometry;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape {

	protected Point center;
	protected int radius;
	
	public Circle() {
		
	}
	
	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}
	
	public Circle(Point center, int radius, boolean selected) {
		this(center, radius);
		this.selected = selected;
	}

	public double area() {
		return this.radius * this.radius * Math.PI;
	}
	
	public boolean contains(int x, int y) {
		return center.distance(x, y) <= radius;
	}

	public boolean contains(Point p) {
		return this.contains(p.getX(), p.getY());
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawOval(center.getX() - radius, center.getY() - radius, radius + radius, radius + radius);

		if (selected) {
			g.setColor(Color.BLUE);
			g.drawRect(center.getX() - 2, center.getY() - 2, 4, 4);
			g.drawRect(center.getX() - radius - 2, center.getY() - 2, 4, 4);
			g.drawRect(center.getX() + radius - 2, center.getY() - 2, 4, 4);
			g.drawRect(center.getX() - 2, center.getY() - radius - 2, 4, 4);
			g.drawRect(center.getX() - 2, center.getY() + radius - 2, 4, 4);
		}
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			Circle temp = (Circle) obj;
			if (this.center.equals(temp.center) && this.radius == temp.radius) {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		return "Center: " + center + ", radius: " + radius;
	}

	public double circumference() {
		return 2 * this.radius * Math.PI;
	}
	
	@Override
	public int compareTo(Object o) {
		if (o instanceof Circle) {
			return (int) (this.area() - ((Circle) o).area());
		}
		return 0;
	}

	@Override
	public void moveTo(int x, int y) {
		center.moveTo(x, y);
	}

	@Override
	public void moveBy(int byX, int byY) {
		center.moveBy(byX, byY);
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) throws Exception {
		if (radius < 0) {
			throw new Exception("radius ne moze biti manji od 0");
		}
		this.radius = radius;
	}
}