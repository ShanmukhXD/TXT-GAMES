import java.util.*;

class RockPaperScissors {
    static final Scanner sc = new Scanner(System.in);

    String convertChoice(int ch) {
        if (ch == 1) return "Rock";
        else if (ch == 2) return "Paper";
        else if (ch == 3) return "Scissors";
        else return "INVALID OPTION CHOSEN";
    }

    int input() {
        System.out.println("---OPTIONS--- \n1. Rock \n2. Paper \n3. Scissors");
        int ch = 0;
        if (sc.hasNextInt()) {
            ch = sc.nextInt();
        } else {
            System.out.println("ENTER ONLY INTEGERS (1, 2 or 3)");
            sc.next();
        }
        return ch;
    }

    void game() {
        RockPaperScissors ob = new RockPaperScissors();
        int comp = (int) (Math.random() * 3 + 1);
        int ch = ob.input();

        System.out.println("YOU HAVE CHOSEN: " + ob.convertChoice(ch));
        System.out.println("COMPUTER CHOSE: " + ob.convertChoice(comp));

        if (ch == comp)
            System.out.println("IT IS A TIE");
        else if ((ch == 1 && comp == 3) || (ch == 2 && comp == 1) || (ch == 3 && comp == 2))
            System.out.println("YOU WON!!");
        else
            System.out.println("COMPUTER WON");

        System.out.println("PLAY AGAIN? (yes/no): ");
        String str = sc.next().toLowerCase();
        ob.rerun(str);
    }

    void rerun(String str) {
        if (str.equals("y") || str.equals("yes")) {
            game();
        } else {
            System.out.println("THANKS FOR PLAYING!");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        RockPaperScissors ob = new RockPaperScissors();
        ob.game();
    }
}
