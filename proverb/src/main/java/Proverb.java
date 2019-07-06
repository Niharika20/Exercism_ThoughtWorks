class Proverb {
	
	private String[] words;

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        //check if input is null.
		if(words.length == 0)
			return "";
		
		//if input is not null.
		StringBuilder proverb = new StringBuilder();
		
		for(int i=0; i<words.length - 1; i++){ 
			proverb.append("For want of a ")
				.append(words[i])
				.append(" the ")
				.append(words[i+1])
				.append(" was lost.\n"); 
		}
		proverb.append("And all for the want of a ")
			.append(words[0])
			.append(".");
		
		return proverb.toString();
    }

}
