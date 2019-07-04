class RnaTranscription {

    String transcribe(String dnaStrand) {
        
		private String rnaStrand="";
		
		for(int i=0; i<dnaStrand.length(); i++)
		{
			switch(dnaStrand.charAt(i))
			{
				case 'G':
				rnaStrand=rnaStrand + "C";
				break;
				
				case 'C':
				rnaStrand=rnaStrand + "G";
				break;
				
				case 'T':
				rnaStrand=rnaStrand + "A";
				break;
				
				case 'A':
				rnaStrand=rnaStrand + "U";
				break;
			}
		
		
		}
		
		return rnaStrand;

    }

}
