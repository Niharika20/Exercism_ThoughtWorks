class PrimeCalculator {

    int nth(int nth) {
        
			int i;
			int count;
			
			if(nth < 1)
				throw new IllegalArgumentException();

			for(i = 2, count = 0; count < nth; i++)
				if(checkPrime(i))
					count++;
				
			return i - 1 ;	
		}	
	
	boolean checkPrime(int number) {
		
		for(int i = 2; i <= Math.sqrt(number); i++)
			if(number % i == 0)
				return false;
		return true;
	}	
}
