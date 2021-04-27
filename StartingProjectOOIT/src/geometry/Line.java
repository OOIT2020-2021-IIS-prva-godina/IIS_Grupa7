package geometry;

import java.awt.Color;
import java.awt.Graphics;

public class Line extends Shape {

	private Point startPoint;
	private Point endPoint;
	
	public Line() {
	}

	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}

	public Line(Point startPoint, Point endPoint, boolean selected) {
		this(startPoint, endPoint);// prva naredba u bloku (telu konstruktora)
		this.selected = selected;
	}
	
	public boolean equals(Object obj) {

		if (obj instanceof Line) {

			Line pomocna = (Line) obj;
			if (startPoint.equals(pomocna.startPoint) && endPoint.equals(pomocna.endPoint))
				return true;
			else
				return false;
		} else
			return false;

	}
	
	public String toString() {
		return startPoint+"-- >"+endPoint;
	}
	
	public boolean contains(int x, int y) {
		return (startPoint.distance(x, y) + endPoint.distance(x, y)) - length() <= 2;
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawLine(startPoint.getX(), startPoint.getY(), endPoint.getX(), endPoint.getY());

		if (selected) {
			g.setColor(Color.BLUE);
			g.drawRect(getStartPoint().getX() - 2, getStartPoint().getY() - 2, 4, 4);
			g.drawRect(getEndPoint().getX() - 2, getEndPoint().getY() - 2, 4, 4);
		}
	}

	public double length() {
		return this.startPoint.distance(this.endPoint.getX(), this.endPoint.getY());
	}
	
	@Override
	public int compareTo(Object o) {
		if (o instanceof Line) {
			return (int)(this.length() - ((Line) o).length());
		}
		return 0;
	}


	@Override
	public void moveTo(int x, int y) {

	}

	@Override
	public void moveBy(int byX, int byY) {
		startPoint.moveBy(byX, byY);
		endPoint.moveBy(byX, byY);
	}

	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}
	public Point getStartPoint () {
		return this.startPoint;
	}
	public Point getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}
}