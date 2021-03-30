package geometry;

public class Rectangle {

	private Point upperLeft;
	private int width;
	private int height;
	private boolean selected;
	
	public Rectangle() {
	}

	public Rectangle(Point upperLeft, int width, int height) {
		this.upperLeft = upperLeft;
		this.width = width;
		this.height = height;
	}

	public Rectangle(Point upperLeft, int width, int height, boolean selected) {
		this(upperLeft, width, height);
		this.selected = selected;
	}
	
	public boolean equals(Object obj) {

		if (obj instanceof Rectangle) {

			Rectangle pomocna = (Rectangle) obj;
			if (this.upperLeft.equals(pomocna.upperLeft) && this.width == pomocna.width
					&& this.height == pomocna.height)
				return true;
			else
				return false;
		} else
			return false;

	}
	
	public String toString() {
		return "Upper left point: " + upperLeft + ", width =" + width + ", height =" + height;
	}
	
	public boolean contains(int x, int y) {
		return (upperLeft.getX() < x && upperLeft.getX() + width > x
				&& upperLeft.getY() < y && upperLeft.getY() + height > y);
	}

	public boolean contains(Point p) {
		return this.contains(p.getX(), p.getY());
	}

	public int area() {
		return this.width * this.height;
	}

	public int circumference() {
		return 2 * this.width + 2 * this.height;
	}

	public Point getUpperLeftPoint() {
		return upperLeft;
	}

	public void setUpperLeftPoint(Point upperLeftPoint) {
		this.upperLeft = upperLeftPoint;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

}