package K03.src;
import java.awt.Point;

public abstract class Shape {
    private String name;
    public Shape(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public abstract double centerDistance();
    public abstract double distance();
    public abstract double perimeter();
    public abstract double area();
    public abstract boolean touches();
}

class Circle extends Shape { 
	private final int x, y;
	private final double radius;
	
	public Circle(String name, int x, int y, double radius) {
        super(name);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public double getRadius() {
		return this.radius;
	}

    @Override
    public double centerDistance(Circle c) {
		return Math.sqrt(Math.pow((this.x - c.x), 2) + 
						 Math.pow((this.y - c.y), 2));
	}
	
    @Override
	public double distance(Circle c) {
		return centerDistance(c) - radius - c.getRadius();
	}
	
    @Override
	public boolean overlaps(Circle c) {
		return distance(c) < 0;
	}
	
    @Override
	public boolean touches(Circle c) {
		return distance(c) == 0;
	}
	
    @Override
	public double perimeter(Circle c) {
		return 2 * Math.PI * radius;
	}
}

class Rectangle extends Shape { 
	private final int x1, x2, y1, y2;
	
	public Rectangle(String name, int x1, int x2, int y1, int y2) {
        super(name);
		this.x1 = x1;
        this.x2 = x2;
		this.y1 = y1;
        this.y2 = y2;
	}
	
	public Point[] getCoords() {
        Point[] coords = {
            new Point(this.x1, this.y1),
            new Point(this.x1, this.y2),
            new Point(this.x2, this.y1),
            new Point(this.x2, this.y2),
        }
		return coords;
	}

    public abstract double centerDistance() {

    }

    public abstract double distance(){

    }

    public abstract double perimeter() {

    }

    public abstract double area() {

    }

    public abstract boolean touches() { 

    }
}