class LargestSeriesProductCalculator {
	private String inputNumber;

    LargestSeriesProductCalculator(String inputNumber) {
    	if(inputNumber.matches(".*[a-zA-Z].*"))
    		throw new IllegalArgumentException("String to search may only contain digits.");
        this.inputNumber = inputNumber;
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {

    	long maxProduct = 0;
    	int input;

    	if(validate(numberOfDigits)){

    		for(int j = 0; j <= inputNumber.length() - numberOfDigits; j++){

    			long product = 1;

    			for(int i = j; i < j + numberOfDigits; i++){

    				input = Character.getNumericValue(inputNumber.charAt(i));
    				product *= input;
    			}

    			maxProduct = Math.max(maxProduct, product);
    		}
    	}

    	return maxProduct;
    }

    private boolean validate(int numberOfDigits){

    	if(numberOfDigits < 0)
    		throw new IllegalArgumentException("Series length must be non-negative.");
    	if(numberOfDigits > inputNumber.length())
    		throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
    	return true;

    }
}
