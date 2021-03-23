package geometry;

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
		c1.getCenter().setX(r1.area() - l1.getStartPoint().getY());
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
	}

}
