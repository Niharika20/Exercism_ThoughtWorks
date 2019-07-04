class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

		int n,temp=numberToCheck,sum=0;
		
		while(temp!=0)
		{
			n=numberToCheck%10;
			numberToCheck=numberToCheck/10;
			sum=sum+(n*n*n);
		}	
		
		if(temp==sum)
			return true;
		else
			return false;
	}

}
