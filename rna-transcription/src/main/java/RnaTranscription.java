import java.util.HashMap;

//updated program using hashmap.
class RnaTranscription {
	
	private HashMap<Character, Character> hm = new HashMap<>();
	
	RnaTranscription()
	{
		hm.put('G','C');
		hm.put('C','G');
		hm.put('T','A');
		hm.put('A','U');
	}

    String transcribe(String dnaStrand) {
        //create an empty string builder object
		StringBuilder rnaStrand = new StringBuilder();
		
		for(int i=0; i<dnaStrand.length(); i++)
		{
			//using append function to add the characters in rnaStrand
			rnaStrand.append(hm.get(dnaStrand.charAt(i)));
		}
		
		//return rnaStrand as String.
		return rnaStrand.toString();
	}	
}

//Also implemented using Switch before.

/*class RnaTranscription {

    String transcribe(String dnaStrand) {
        
		StringBuilder rnaStrand = new StringBuilder();
		
		for(int i=0; i<dnaStrand.length(); i++)
		{
			switch(dnaStrand.charAt(i))
			{
				case 'G':
				rnaStrand.append("C");
				break;
				
				case 'C':
				rnaStrand.append("G");
				break;
				
				case 'T':
				rnaStrand.append("A");
				break;
				
				case 'A':
				rnaStrand.append("U");
				break;
			}
		
		
		}
		
		return rnaStrand.toString();

    }

}
*/