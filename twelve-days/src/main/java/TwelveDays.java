import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class TwelveDays {
	
	private List<String> days;
	private List<String> verse;
	
	TwelveDays()
	{
		//Initialize the lists.
		days = new ArrayList<String>(Arrays.asList("first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"));
		verse = new ArrayList<String>(Arrays.asList("twelve Drummers Drumming", "eleven Pipers Piping", "ten Lords-a-Leaping", "nine Ladies Dancing", 
													"eight Maids-a-Milking","seven Swans-a-Swimming", "six Geese-a-Laying", "five Gold Rings", "four Calling Birds",
													"three French Hens", "two Turtle Doves", "a Partridge in a Pear Tree."));
	}	
	
    String verse(int verseNumber) {
        StringBuilder song = new StringBuilder("On the " + days.get(verseNumber - 1) + " day of Christmas my true love gave to me: ");

        String last = verse.get(11) + "\n";
        
        //if verseNumber is 1 then return last verse else return sublist as joined verse from verseNumber to last verse. 
        return (verseNumber==1) ? song.append(last).toString() : song.append(String.join(", ", verse.subList(12 - verseNumber, 11))).append(", and ").append(last).toString();
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder lyrics = new StringBuilder();

        for(int i = startVerse; i <= endVerse; i++)
        {
        	if(i < endVerse)
        		lyrics.append(verse(i)).append("\n");
        	else
        		lyrics.append(verse(i));
        }

        return lyrics.toString();
    }
    
    String sing() {
        return verses(1,12);
    }
}

