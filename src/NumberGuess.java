import java.util.*;
class NumberGuess{
    boolean check(int guess, int n){
        return guess==n;
    }
    void game(){
        Scanner sc = new Scanner(System.in);
        int n = (int)(Math.random()*10)+1;
        System.out.println("Enter maximum number of allowed attempts: ");
        if(sc.hasNextInt()) {
            int attempts = sc.nextInt();
            while (attempts > 0) {
                System.out.println("Guess a number between 1 to 10 (" + attempts + " attempts left)");
                if(sc.hasNextInt()) {
                    int guess = sc.nextInt();
                    if (check(guess, n)) {
                        System.out.println("CONGRATULATIONS!!! YOU HAVE WON");
                        break;
                    } else {
                        attempts--;
                        if (attempts == 0) {
                            System.out.println("YOU LOST... THE NUMBER WAS: "+n);
                            break;
                        } else {
                            System.out.println("INCORRECT GUESS");
                        }
                    }
                }
            }
        } else
            System.out.println("ENTER ONLY INTEGERS");
        System.out.println("DO YOU WANT TO PLAY AGAIN? ");
        sc.nextLine();
        if(sc.hasNextLine()) {
            String ch = sc.nextLine().toLowerCase();
            retry(ch);
        } else
            System.out.println("Enter only yes or no");
    }
    void retry(String f) {
        if(f.equals("y") || f.equals("yes")){
            game();
        } else
            System.exit(0);
    }
    public static void main(String[] args){
        NumberGuess ob = new NumberGuess();
        ob.game();
    }
}