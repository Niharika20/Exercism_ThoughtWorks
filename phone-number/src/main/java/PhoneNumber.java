class PhoneNumber{

	private String phoneNumber;

	PhoneNumber(String number){
	 	phoneNumber = number.replaceAll("[-.()\\s+]", "");

	 	if(!phoneNumber.matches("[0-9]*"))
          validatePattern();
	 	
	 	validateLengthAndStartingCharacter(phoneNumber.length(),phoneNumber.charAt(0));
	 	validateAreaCode(phoneNumber.charAt(0));
	 	validateExchangeCode(phoneNumber.charAt(3));
	}

	private void validateLengthAndStartingCharacter(int length, char start){

		if(length < 10)
			throw new IllegalArgumentException("incorrect number of digits");
		else if(length > 11)
			throw new IllegalArgumentException("more than 11 digits");
		else if(length == 11 && start == '1')
			phoneNumber = phoneNumber.substring(1);
		else if(length == 11 && start != 1)
			throw new IllegalArgumentException("11 digits must start with 1");
	}

	private void validateAreaCode(char c){
		if(c == '0')
			throw new IllegalArgumentException("area code cannot start with zero");
		else if(c == '1')
			throw new IllegalArgumentException("area code cannot start with one");
	}

	private void validateExchangeCode(char c){
		if(c == '0')
			throw new IllegalArgumentException("exchange code cannot start with zero");
		else if(c == '1')
			throw new IllegalArgumentException("exchange code cannot start with one");
	}

	private void validatePattern(){
      if(phoneNumber.matches("[a-zA-Z0-9]*"))
          throw new IllegalArgumentException("letters not permitted");
      else throw new IllegalArgumentException("punctuations not permitted");
    }

	public String getNumber(){
		return phoneNumber;
	}
}