import java.util.Arrays;
import java.util.List;

class Song {

    public static void main(String[] args) {
        System.out.println(new SongBuilder()
                .add("fly", "")
                .add("spider", "That wriggled and wiggled and tickled inside her.\n")
                .add("bird", "How absurd to swallow a bird.\n")
                .add("cat", "Fancy that to swallow a cat!\n")
                .add("dog", "What a hog, to swallow a dog!\n")
                .add("cow", "I don't know how she swallowed a cow!\n")
                .add("horse", "...She's dead, of course!").sing());
    }
}