package chatbot;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
public class CStarter {
    private ArrayList<String> phraseList = new ArrayList<>(
            Arrays.asList("Hello!", "Hi!")
    );

    public String choosePhrase(){
        Random randObj = new Random();
        int index = randObj.nextInt(phraseList.size());
        return phraseList.get(index);
    }

}
