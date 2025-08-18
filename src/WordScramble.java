import java.util.*;
class WordScramble{
    static String countries[] = {"india", "china", "nepal", "japan", "brazil", "france", "italy", "spain", "egypt", "canada" };
    static String scramble(String word){
        char letters[] = word.toCharArray();
        for(int i = 0; i< letters.length; i++){
            int j = (int)(Math.random()* letters.length);
            char t = letters[i];
            letters[i] = letters[j];
            letters[j] = t;
        }
        return new String(letters);
    }
    static void game() {
        Scanner sc = new Scanner(System.in);
        String word = countries[(int)(Math.random()* countries.length)];
        String scrambled = scramble(word);

        System.out.println("GUESS THE COUNTRY: "+scrambled);
        System.out.println("ENTER YOUR GUESS: ");
        String guess = sc.nextLine();

        if(guess.equalsIgnoreCase(word))
            System.out.println("CORRECT");
        else
            System.out.println("INCORRECT. THE COUNTRY WAS "+word);
    }

    public static void main(String[] args) {
        game();
    }
}