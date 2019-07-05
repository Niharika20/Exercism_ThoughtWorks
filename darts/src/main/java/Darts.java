class Darts {
	
	private double x;
	private double y;
	private double distance;

    Darts(double x, double y) {
        this.x = x;
		this.y = y;
    }
	
    int score() {
		
		CalculateDistance(x,y);  //Calculate distance of the given point from the center.
		
		if(distance<=1) //If the dart lands in the inner circle of the target.
			return 10;
		else if(distance<=5) //If the dart lands in the middle circle of the target,
			return 5;
		else if(distance<=10) //If the dart lands in the outer circle of the target.
			return 1;
		else
			return 0; //If the dart lands outside the target.
    }
	
	private void CalculateDistance(double x, double y)
	{
		distance = Math.sqrt( x * x + y * y );
	}

}
