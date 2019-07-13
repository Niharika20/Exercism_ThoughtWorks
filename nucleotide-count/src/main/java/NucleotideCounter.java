import java.util.HashMap;
import java.util.Map;

class NucleotideCounter {

	private String dnaStrand;
	Map<Character, Integer> countMap = new HashMap<Character, Integer>();

	NucleotideCounter(String dnaStrand)
	{
		this.dnaStrand = dnaStrand;

		countMap.put('A', 0);
		countMap.put('C', 0);
		countMap.put('G', 0);
		countMap.put('T', 0);

		for(char c: dnaStrand.toCharArray())
		{
			if(countMap.containsKey(c))
				countMap.put(c,countMap.get(c)+1) ;
			
			else
				throw new IllegalArgumentException();
		}
	}

	public Map<Character, Integer> nucleotideCounts(){
		return countMap;
	}
}