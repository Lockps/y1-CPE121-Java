import java.util.Random;
import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        System.out.print("scissor (0), rock (1),paper (2) :");
        int inp = sc.nextInt();
        int com = ran.nextInt(3);
        if (inp != com) {
            switch (com) {
                case 0:
                    switch (inp) {
                        case 1:
                            System.out.println("Computer choose scissor you win");
                            break;
                        case 2:
                            System.out.println("Computer choose scissor you lose");
                            break;
                    }
                    break;
                case 1:
                    switch (inp) {
                        case 2:
                            System.out.println("Computer choose rock you win");
                            break;
                        case 0:
                            System.out.println("Computer choose rock you lose");
                            break;
                    }
                    break;
                case 2:
                    switch (inp) {
                        case 0:
                            System.out.println("Computer choose paper you win");
                            break;
                        case 1:
                            System.out.println("Computer choose paper you lose");
                            break;
                    }
                    break;
            }
        }
        if (inp == com) {
            switch (com) {
                case 0:
                    System.out.println("The computer is scissors. and you are scissors too. It is a draw.");
                    break;
                case 1:
                    System.out.println("The computer is rock. and you are rock too. It is a draw.");
                    break;
                case 2:
                    System.out.println("The computer is paper. and you are paper too. It is a draw.");
                    break;
            }
        }
    }
}
