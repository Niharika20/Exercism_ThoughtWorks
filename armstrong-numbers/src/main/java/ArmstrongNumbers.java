class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
			
		int res, sum=0;
		int number=numberToCheck;
		int length = String.valueOf(number).length();
		while(number!=0)
		{
			res = number%10;
			sum+= Math.pow(res, length);
			number = number/10;
		}

		return (sum == numberToCheck);
	}

			
}
