class Acronym {
	
	private String phrase;

    Acronym(String phrase) {
		this.phrase = phrase;
    }

    String get() {
        int i;
		//replace special characters with whitespace.
		String text = phrase.replaceAll("[^a-zA-Z0-9' ]", " "); 
		
		//split text into words ignoring multiple white spaces.
		String words[] = text.split(" +");
		StringBuilder acronym = new StringBuilder();
		
		for(i=0; i<words.length; i++)
		{
			acronym.append(words[i].charAt(0));
		}
		return acronym.toString().toUpperCase();	
    }
}
