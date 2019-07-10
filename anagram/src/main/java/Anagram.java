import java.util.*;

class Anagram {

	private String word;

	Anagram(String word){
		this.word = word;
	}

	public List<String> match(List<String> anagrams){

		List<String> sublist = new ArrayList<String>();
		String sortedWord = sort(word);

		for(int i = 0; i < anagrams.size(); i++){
			//if word and item of list does not match and sublist matches.
			if( !word.toLowerCase().equals(anagrams.get(i).toLowerCase()) && isSublist(sortedWord, anagrams.get(i)))
				sublist.add(anagrams.get(i));
		}
		return sublist;
	}


	private boolean isSublist(String word1, String word2){
		word2 = sort(word2);                 //sort and compare words.
		return word1.equals(word2);
	}

	private String sort(String s){
		char[] sorted = s.toLowerCase().toCharArray();   //sort by converting to array.
		Arrays.sort(sorted);

		return new String(sorted);  // return as string
	}
}