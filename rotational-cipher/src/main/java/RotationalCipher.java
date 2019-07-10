class RotationalCipher {
	
	private static final int MODULO_VALUE = 26;
	private int shiftKey;

    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(String data) {
        
		int i;
		StringBuilder cipher = new StringBuilder();
		
		for(i = 0; i < data.length(); i++){
		
			char c = data.charAt(i);
			
			//check if character is alphabet or not. 
			if(Character.isLetter(c)) {
				
			if(Character.isUpperCase(c))
				c = upperCaseRotation(c);
			else
				c = lowerCaseRotation(c);
			}
			
			cipher.append(c);
		}

		return cipher.toString();

    }
	
	private char lowerCaseRotation(char c) {
		return (char)(int)((c - 'a' + shiftKey) % MODULO_VALUE + 'a');
		
	}

	private char upperCaseRotation(char c) {
		return (char)(int)((c - 'A' + shiftKey) % MODULO_VALUE + 'A');

	}	

}
