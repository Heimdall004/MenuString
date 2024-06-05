package classes;

import java.util.Scanner;


/**
 * MaxWords
 */
public class MaxWords{

    public MaxWords(){
        in = new Scanner(System.in);
    }

    public String maxWords(){

        String[] words = getWord();
        String longestWord = words[0];

        for(String word: words ){
            if(word.length() > longestWord.length() ){
                longestWord = word;
            }
        }

        return ANSI_CYAN + "The longest word is: " + longestWord + ANSI_RESET;

    }

    private String[] getWord(){
        String[] words = new String[4];

        for(int i = 0; i < words.length; i++){
            System.out.print("Enter your word: ");
            words[i] = in.nextLine();
        }
        return words;
    }

    private Scanner in;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";
}