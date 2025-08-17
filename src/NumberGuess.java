import java.util.*;
class NumberGuess{
    final int n = (int)(Math.random()*10)+1;
    static final  Scanner sc = new Scanner(System.in);
    boolean check(int guess){
        return guess==n;
    }
    void game(){
        System.out.println("Enter maximum number of allowed attempts: ");
        int attempts = sc.nextInt();
        while(attempts>0){
             System.out.println("Guess a number between 1 to 10 ("+attempts+" attempts left)");
             int guess = sc.nextInt();
             if(check(guess)){
                 System.out.println("CONGRATULATIONS!!! YOU HAVE WON");
                 break;
             } else{
                 if(attempts > 0){
                     System.out.println("INCORRECT GUESS");
                     attempts--;
                 } else{
                     System.out.println("YOU LOST");
                     break;
                 }
             }
        }
        System.out.println("DO YOU WANT TO PLAY AGAIN? ");
        String ch = sc.nextLine().toLowerCase();
        retry(ch);
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