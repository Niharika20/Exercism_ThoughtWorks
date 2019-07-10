import java.util.List;
import java.util.ArrayList;

class Series{
	
	private String digits;

	Series(String digits){
		this.digits = digits;
	}
	
	List<String> slices(int slice){
		List<String> series = new ArrayList<>();
		int i = 0;
		//check if size of slice is valid or not.
		if(validateSliceSize(slice)){
			while(i <= digits.length() - slice){
				series.add(digits.substring(i , i + slice));
				i++;
			}
		}
		return series;
	}

	private boolean validateSliceSize(int size){

		if(size <= 0)
			throw new IllegalArgumentException("Slice size is too small.");
		else if(size > digits.length())
			throw new IllegalArgumentException("Slice size is too big.");
		else
			return true;
	}
}