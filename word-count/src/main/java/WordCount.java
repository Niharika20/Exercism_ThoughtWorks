import java.util.*;
class WordCount {
    
    private Map<String, Integer> words = new HashMap<>();
    private String sentence;
    
    public Map<String,Integer> phrase(String sentence) {
        this.sentence = sentence;
        setMap();
        return words;
    }

    private void setMap(){
        sentence = sentence.toLowerCase().replaceAll("(?!\')\\p{Punct}", " ").replaceAll("[\\s+]"," ");
        String[] split = sentence.split(" ");
        
        for(int i = 0; i < split.length ; i++){

            if(split[i].startsWith("'") && split[i].endsWith("'"))
                split[i] = split[i].substring(1 , split[i].length() - 1);
            
            if (split[i].isEmpty())
                continue;
            if (!words.containsKey(split[i]))
                words.put(split[i], 1);
            else
                words.put(split[i], words.get(split[i]) + 1);
        }

    }
}	