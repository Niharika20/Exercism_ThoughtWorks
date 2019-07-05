class ResistorColor {
	
	private String[] colors = {"black","brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
	
    int colorCode(String color) {
        
		for(int i=0; i<colors.length ; i++)
		{
			if(color.equals(colors[i]))
				return i;
		}	
		return 0;
    }

    String[] colors() {
        return colors;
    }
}
