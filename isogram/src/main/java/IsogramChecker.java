class IsogramChecker {

    boolean isIsogram(String phrase) {
        
		phrase = phrase.replace(" ","").replace("-","").toLowerCase();
		
		for(int i=0; i<phrase.length(); i++)
		{
			if(phrase.indexOf(phrase.charAt(i),i+1)>0)
				return false;
		}
		return true;
    }

}
