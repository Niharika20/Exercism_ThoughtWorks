public class PangramChecker {

    public boolean isPangram(String input) {
        input = input.toUpperCase();
		
		for(char c ='A'; c<='Z'; c++)
		{
			if(input.indexOf(c)<0)
				return false;
		}	
		return true;
    }

}
