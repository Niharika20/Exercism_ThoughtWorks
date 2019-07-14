class NaturalNumber {
	
	private int number;	
	
	NaturalNumber( int number ){
		if(number <= 0)
			throw new IllegalArgumentException("You must supply a natural number (positive integer)");
		this.number = number;
	}
	
	Classification getClassification()
	{
		int aliquotSum = calculateAliquotSum(number);
		
		if(aliquotSum == number)
			return Classification.PERFECT;
		else if(aliquotSum > number)
			return Classification.ABUNDANT;
		else
			return Classification.DEFICIENT;
	}
	
	int calculateAliquotSum(int number)
	{
		int i, sum = 0;
		for(i = 1; i<number; i++)
		{
			if(number%i == 0)  //checking if i is factor of number.
				sum += i;
		}
		return sum;
	}
}
