package geometry;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point();
		p1.setX(3);
		p1.setY(5);
		p1.setSelected(true);
		
		System.out.println("X p1: " + p1.getX());
		System.out.println("Y p1: " + p1.getY());
		System.out.println("Selected p1: " + p1.isSelected());
		
		Point p2 = new Point();
		p2.setX(13);
		p2.setY(15);
		p2.setSelected(true);
		
		System.out.println("Udaljenost je: " + p1.distance(p2.getX(), p2.getY()));
		p1.setX(p2.getX());
		System.out.println("Udaljenost je: " + p1.distance(p2.getX(), p2.getY()));
		
		// VEZBE 3
		Point p3 = new Point();
		p3.setX(15);
		p3.setY(27);
		p3.setSelected(true);
		Line l1 = new Line();
		Rectangle r1 = new Rectangle();
		Circle c1 = new Circle();

		// 1. Inicijalizovati x koordinatu tacke p1
		// na vrednost y koordinate tacke p2
		System.out.println("Stara vrednost koordinate: "+ p1.getX());
		p1.setX(p2.getY());
		System.out.println("Nova vrednost koordinate: "+p1.getX());

		// 2. Postaviti za pocetnu tacku linije l1 tacku p1, a
		// za krajnju tacku linije l1 tacku p2
		l1.setStartPoint(p1);
		l1.setEndPoint(p2);

		// 3. Postaviti y koordinatu krajnje tacke l1 na 23
		l1.getEndPoint().setY(23);

		// 4. Inicijalizovati x koordinatu pocetne tacke linije l1
		// na vrednost y koordinate krajnje tacke linije l1
		System.out.println("Stara vrednost koordinate: "+l1.getStartPoint().getX());
		l1.getStartPoint().setX(l1.getEndPoint().getY());
		System.out.println("Nova vrednost koordinate: "+l1.getStartPoint().getX());

		// 5. Postaviti x koordinatu krajnje tacke l1 na vrednost
		// duzine linije l1 umanjene za vrednost zbira x i y
		// koordinate pocetne tacke linije l1
		l1.getEndPoint().setX((int)(l1.length()-(l1.getStartPoint().getX()+l1.getStartPoint().getY())));

		// 6. Postaviti x koordinatu tacke gore levo pravougaonika
		// r1 na vrednost 10 i y koordinatu na vrednost 15
		r1.setUpperLeftPoint(p1);
		r1.getUpperLeftPoint().setX(10);
		r1.getUpperLeftPoint().setX(15);

		// 7. Postaviti centar kruga c1 na koordinate tacke
		// gore levo od r1
		c1.setCenter(r1.getUpperLeftPoint());

		// 8. Postaviti x koordinatu centra kruga c1 na vrednost razlike
		// povrsine pravougaonika r1 i y koordinate pocetne tacke linije l1
		r1.setWidth(30);
		r1.setHeight(20);
		//c1.getCenter().setX(r1.area() - l1.getStartPoint().getY());
		try {
			c1.setRadius(-10);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(c1.getCenter().getX());
		
		// VEZBE 4
		Point p4 = new Point(50,100);
		System.out.println(p4.isSelected() + " " + p4.getX());
		Line l2 = new Line(p4, new Point(400, 500));
		Rectangle r2 = new Rectangle(p4, 50, 80);

		System.out.println(p2.toString()); // ili System.out.println(p2);
		System.out.println(l2);
		System.out.println(r2);

		int c = 5; 
		int d = 5; 
		System.out.println(c == d); 

		d = 7; 
		System.out.println(c == d); 

		Point p5 = new Point();
		System.out.println(p5 == p2);
		p5 = p2; // dodeljuje se referenca i  vrednost
		System.out.println(p5);
		p2.setX(20);
		System.out.println(p5);
		System.out.println(p5 == p2);
		System.out.println(p2);

		Point p6 = new Point(20, 100);
		System.out.println(p6 == p2);
		System.out.println(p6.equals(p2)); // pre i posle redefinisanja metode
		
		p6.setX(p5.getX());
		
		// VEZBE 5
		Point p7 = new Point(6, 7);
		System.out.println("p7 contains p8: " + p6.contains(p7.getX(), p7.getY()));
		System.out.println("p7 contains p8 + 1: " + p6.contains(p7.getX() + 1, p7.getY() + 1));

		Line l6 = new Line(new Point(10, 15), new Point(20, 25));
		System.out.println("l6 contains (21, 25): " + l6.contains(21, 25));

		Circle c4 = new Circle(p5, 10);
		System.out.println("c4 contains p8: " + c4.contains(p7));
		System.out.println("c4 contains (6, 7): " + c4.contains(6, 7));

		Donut d1 = new Donut();
		// d1.center = new Point(10, 20);
		d1.setCenter(new Point(10, 20));
		d1.setInnerR(10);
		//d1.setRadius(50);

		System.out.println(d1);
		System.out.println("d1 contains (24, 20): " + d1.contains(24, 20));
		Circle c5 = new Circle(d1.center, d1.radius);
		System.out.println("d1 equals c5: " + d1.equals(c5));

		Donut d2 = new Donut(new Point(10, 20), 50, 10);
		System.out.println("d1 equals d2: " + d1.equals(d2));

		System.out.println("d1 area: " + d1.area());
		System.out.println("d1 circumference: " + d1.circumference());
		
		// VEZBE 7
		System.out.println(p1);
		p1.moveBy(5, 3);
		System.out.println(p1);
		p1.moveTo(5, 3);
		System.out.println(p1);

		System.out.println(l1);
		l1.moveBy(5, 3);
		System.out.println(l1);

		System.out.println(r1);
		r1.moveBy(5, 3);
		System.out.println(r1);
		r1.moveTo(5, 3);
		System.out.println(r1);

		System.out.println(c1);
		c1.moveBy(5, 3);
		System.out.println(c1);
		c1.moveTo(5, 3);
		System.out.println(c1);

		System.out.println(d1);
		d1.moveBy(5, 3);
		System.out.println(d1);
		d1.moveTo(5, 3);
		System.out.println(d1);

		Shape d3 = new Donut(p1, 10, 2);
		Shape p9 = new Point();
		Shape l9 = l1;
		Shape c9 = c1;

		Shape[] shapes = {d3, p9, l9, c9};
		System.out.println("\n");
		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i]);
		}

		for (int i = 0; i < shapes.length; i++) {
			shapes[i].moveBy(1, 2);
		}

		System.out.println("\n");
		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i]);
		}

		int[] ints = {5,2,3,4,1};
		System.out.println("Nesortiran niz\n");
		for (int i = 0; i < ints.length; i++) {
			System.out.print(ints[i]);
		}

		Arrays.sort(ints);

		System.out.println("\nSortiran niz\n");
		for (int i = 0; i < ints.length; i++) {
			System.out.print(ints[i]);
		}


		Point p10 = new Point(10, 10);
		Point p20 = new Point(20, 20);
		Point p30 = new Point(30, 30);
		Point p40 = new Point(40, 40);
		Point p50 = new Point(50, 50);

		Point[] points = {p30, p10, p20, p50, p40};
		System.out.println("\nNesortiran niz: ");
		for (int i = 0; i < points.length; i++) {
			System.out.println(points[i]);
		}

		Arrays.sort(points);

		System.out.println("Sortiran niz: ");
		for (int i = 0; i < points.length; i++) {
			System.out.println(points[i]);
		}

		Line l10 = new Line(new Point(10, 10), new Point(100, 100));
		Line l20 = new Line(new Point(10, 10), new Point(200, 200));
		Line l30 = new Line(new Point(10, 10), new Point(300, 300));
		Line[] lines = {l30, l10, l20};
		System.out.println("\nNesortiran niz: ");
		for (int i = 0; i < lines.length; i++) {
			System.out.println(lines[i]);
		}

		Arrays.sort(lines);

		System.out.println("Sortiran niz: ");
		for (int i = 0; i < lines.length; i++) {
			System.out.println(lines[i]);
		}

		Rectangle r10 = new Rectangle(p1, 10, 10);
		Rectangle r20 = new Rectangle(p2, 20, 20);
		Rectangle r30 = new Rectangle(p3, 30, 30);
		Rectangle[] rectangles = {r30, r10, r20};
		System.out.println("\nNesortiran niz: ");
		for (int i = 0; i < rectangles.length; i++) {
			System.out.println(rectangles[i]);
		}

		Arrays.sort(rectangles);

		System.out.println("Sortiran niz: ");
		for (int i = 0; i < rectangles.length; i++) {
			System.out.println(rectangles[i]);
		}

		Circle c10 = new Circle(p1, 10);
		Circle c20 = new Circle(p1, 20);
		Circle c30 = new Circle(p1, 30);
		Circle[] circles = {c30, c10, c20};
		System.out.println("\nNesortiran niz: ");
		for (int i = 0; i < circles.length; i++) {
			System.out.println(circles[i]);
		}

		Arrays.sort(circles);

		System.out.println("Sortiran niz: ");
		for (int i = 0; i < circles.length; i++) {
			System.out.println(circles[i]);
		}

		Donut d10 = new Donut(p10, 100, 10);
		Donut d20 = new Donut(p10, 100, 20);
		Donut d30 = new Donut(p10, 100, 30);
		Donut[] donuts = {d30, d10, d20};
		System.out.println("\nNesortiran niz: ");
		for (int i = 0; i < donuts.length; i++) {
			System.out.println(donuts[i]);
		}

		Arrays.sort(donuts);

		System.out.println("Sortiran niz: ");
		for (int i = 0; i < donuts.length; i++) {
			System.out.println(donuts[i]);
		}
	}

}
