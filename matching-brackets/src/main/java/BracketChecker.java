import java.util.*;
class BracketChecker{

	private String brackets;

	BracketChecker(String brackets){

		this.brackets = brackets;
	}

	boolean areBracketsMatchedAndNestedCorrectly() {

		if(brackets.length() == 0)
				return true;

		Stack<Character> checker = new Stack<Character>();

		HashMap<Character, Character> match = new HashMap<Character, Character>();

		match.put('}','{');
		match.put(')','(');
		match.put(']','[');


		for(int i =0; i<brackets.length(); i++){

			if(match.containsValue(brackets.charAt(i))){
				checker.push(brackets.charAt(i));
			}

			else if(match.keySet().contains(brackets.charAt(i))){
				if(checker.empty() || checker.pop() != match.get(brackets.charAt(i)))
					return false;
			}		
		}
		return checker.empty();
	}
}