

import java.util.Scanner;

public class number_game {
    static int generatedNum = 0;

    public static int getrandom(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hasWon = 0;
        int max = 50;
        int score = 0;
        do {

            generatedNum = getrandom(0, max);

            System.out.println(generatedNum);
            System.out.println("-----------------Range is from 0 to " + max + "------------------");

            for (int i = 0; i < 5; i++) {

                System.out.print("Enter the number : ");
                int guess = sc.nextInt();
                int difference = Math.abs(guess - generatedNum);

                if (guess == generatedNum) {
                    System.out.println("You Won");
                    hasWon = 1;
                    System.out.println("Next level");
                    score += 10;
                    System.out.println("\t\t\tScore : " + score);
                    max += 20;
                    break;

                } else if (guess > generatedNum) {

                    if (difference > 15) {
                        System.out.println("you are too high");
                    } else
                        System.out.println("you are high");
                } else if (guess < generatedNum) {

                    if (difference > 15) {
                        System.out.println("you are too low");
                    } else
                        System.out.println("you are low");
                }
            }

            if (hasWon != 1) {
                System.out.println("you lost the number was : " + generatedNum);
            }

        } while (true);
    }

}
