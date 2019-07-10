class Triangle {
	
	private double side1;
	private double side2;
	private double side3;

    Triangle(double side1, double side2, double side3) throws TriangleException {

		if(!isTriangle(side1, side2, side3)) //For a shape to be a triangle
			throw new TriangleException();
		
        this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
    }
	
	boolean isTriangle(double side1, double side2, double side3){
		return (side1 > 0 & side2 > 0 & side3 > 0) & (side1 + side2 >= side3 & side2 + side3 >= side1 & side1 + side3 >= side2);
	}

    boolean isEquilateral() {
        return (side1 == side2) & (side1 == side3);  //An equilateral triangle has all three sides the same length
    }

    boolean isIsosceles() {
        return (side1 == side2)||(side1 == side3) ||(side2 == side3);   //An isosceles triangle has at least two sides the same length.
    }

    boolean isScalene() {
        return (side1 != side2 & side1 != side3 & side2 != side3);  //A scalene triangle has all sides of different lengths.
    }
	
	boolean isDegenerate() {
		return ((side1 + side2) == side3) || ((side1 + side3) == side2) || ((side2 + side3) == side1) ;   //sum of the lengths of two sides equals that of the third
	}

}
