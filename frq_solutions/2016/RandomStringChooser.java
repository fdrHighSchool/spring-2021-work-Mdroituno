import java.util.*;
public class RandomStringChooser {
    private ArrayList<String> wordArray;
    public RandomStringChooser(String[] words){
        this.wordArray = new ArrayList<String>();
        this.copy(words, this.wordArray);
        
    }
    public void copy(String[] original, ArrayList<String> into){
        for(String word: original){
            into.add(word);
        }
    }
    
    public String getNext(){
        if(this.wordArray.size() > 0){
            Random rand = new Random();
            int randint = rand.nextInt(wordArray.size());
            return wordArray.remove(randint);
        }
        else{ return "NONE";}
    }
    
    public static void main(String[] args) {
        String[] wordArray = {"wheels", "on", "the", "bus"};
        RandomStringChooser sChooser = new RandomStringChooser(wordArray);
        for(int k = 0; k < 6; k++){
            System.out.print(sChooser.getNext() + " ");
        }
        System.out.println();
        RandomLetterChooser letterChooser = new RandomLetterChooser("cat");
        for(int k = 0; k < 4; k++){
            System.out.print(letterChooser.getNext());
        }
    }
}

class RandomLetterChooser extends RandomStringChooser{
    public RandomLetterChooser(String str){
        super(getSingleLetters(str));
    }
   public static String[] getSingleLetters(String str){
        return str.split("");
    }
}