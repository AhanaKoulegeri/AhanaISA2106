package Program;

abstract class ShapeRBCA22106 {
	    // Abstract methods to calculate area and perimeter
	    public abstract double calculateArea();
	    public abstract double calculatePerimeter();
	}

	// Subclass Circle
	class Circle extends ShapeRBCA22106 {
	    private double radius;

	    // Constructor
	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    // Method to calculate area
	    public double calculateArea() {
	        return Math.PI * radius * radius;
	    }

	    // Method to calculate perimeter
	    public double calculatePerimeter() {
	        return 2 * Math.PI * radius;
	    }
	}

	// Subclass Triangle
	class Triangle extends ShapeRBCA22106 {
	    private double side1, side2, side3;

	    // Constructor
	    public Triangle(double side1, double side2, double side3) {
	        this.side1 = side1;
	        this.side2 = side2;
	        this.side3 = side3;
	    }

	    // Method to calculate area using Heron's formula
	    public double calculateArea() {
	        double s = (side1 + side2 + side3) / 2;
	        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	    }

	    // Method to calculate perimeter
	    public double calculatePerimeter() {
	        return side1 + side2 + side3;
	    }
	}

	