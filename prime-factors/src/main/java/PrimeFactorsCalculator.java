import java.util.ArrayList;
import java.util.List;

class PrimeFactorsCalculator {
	
	List<Long> calculatePrimeFactorsOf(long number) {
		
		List<Long> primeFactors = new ArrayList<Long>();
		long i = 2;
		
		while(number != 1) //
		{
			//The smallest i which divides the given number will automatically be prime.
			
			if(number % i == 0) {     //it will tell if i is prime.
				primeFactors.add(i);  //add i(primeFactor) to the list.
				number = number / i;  //calculate quotient
				i = 2;                //assign the lowest value again to i.
			}
			else
				i++;
		}	
		
		return (primeFactors);
		
	}	
}	