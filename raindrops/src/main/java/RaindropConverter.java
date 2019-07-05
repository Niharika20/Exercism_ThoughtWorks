class RaindropConverter {
	
	String convert(int number) {
		
		StringBuilder output = new StringBuilder();
		
		//If the number has 3 as a factor
		if(number%3 == 0)
			output.append("Pling");
		
		//If the number has 5 as a factor
		if(number%5 == 0)
			output.append("Plang");
		
		//If the number has 7 as a factor
		if(number%7 == 0)
			output.append("Plong");
		
		//If the number does not have 3, 5, or 7 as a factor
		//check if output is empty or not.
		if(output.toString().isEmpty())
			output.append(number);
			
		return output.toString();
		
    }

}
