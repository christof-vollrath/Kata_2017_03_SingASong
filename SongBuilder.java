import java.util.ArrayList;
import java.util.List;

/**
 * Created by tof on 3/27/17.
 */
public class SongBuilder {
    private final List<String> animals = new ArrayList<>();
    private final List<String> rhymes = new ArrayList<>();


    public SongBuilder add(String animal, String rhyme) {
        animals.add(animal);
        rhymes.add(rhyme);
        return this;
    }

    public String sing() {
        StringBuilder result = new StringBuilder();
        result.append(swallowed(animals, 0));
        result.append(endOfVerse(animals));
        for (int i = 1; i < animals.size()-1; i++ ) {
            result.append(swallowed(animals, i));
            result.append(rhyme(rhymes, i));
            result.append(swallow(animals.subList(0, i+1)));
            result.append(endOfVerse(animals));
        }
        result.append(swallowed(animals, 6));
        result.append(rhyme(rhymes, 6));
        return result.toString();
    }

    private String endOfVerse(List<String> strings) {
        StringBuilder result = new StringBuilder();
        result.append("I don't know why she swallowed a ");
        result.append(strings.get(0));
        result.append(" - perhaps she'll die!\n");
        result.append("\n");

        return result.toString();
    }

    public String swallow(List<String> strings) {
        StringBuilder result = new StringBuilder();
        for (int i = strings.size()-2; i >= 0 ; i--) {
            result.append("She swallowed the " + strings.get(i+1) + " to catch the " + strings.get(i));
            if (i > 0) result.append(",");
            else  result.append(";");
            result.append("\n");
        }
        return result.toString();
    }

    public String swallowed(List<String> strings, int position) {

        StringBuilder result = new StringBuilder();

        result.append("There was an old lady who swallowed a ");
        result.append(strings.get(position));
        if (position == 0) result.append(".");
        else if(position == strings.size() - 1)
            result.append("...");
        else  result.append(";");

        result.append("\n");

        return result.toString();
    }

    public String rhyme(List<String> rhymes, int position) {
        return rhymes.get(position);
    }
}
