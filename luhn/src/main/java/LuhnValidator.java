class LuhnValidator {

	//to check doubling of number.
    int toDouble(int second)
	{
		second = second * 2;
		return (second>9)?(second - 9) : second;
		
	}	
	
	boolean isValid(String candidate) {
        
		int sum = 0;
		candidate = candidate.replaceAll(" " , "");  //to remove all the white spaces.
		
		if(candidate.length() <= 1 || !candidate.matches("[0-9]+") )  // to check if string contains any non-digit number and length > 1.
			return false;
		
		for(int i = candidate.length() - 1; i >= 0; i = i - 2) {
			
			int first = Character.getNumericValue(candidate.charAt(i));  // to convert character into integer.
			int second = 0;
			
			if(i>0) {
				second = Character.getNumericValue(candidate.charAt(i-1));
				second = toDouble(second);
			}
			sum += first + second;
		}	
		
		return sum % 10 == 0;
    }

}
