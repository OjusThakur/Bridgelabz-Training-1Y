package com.gla.String.level_2;

import java.util.Scanner;
public class RockPaperScissors {
    public static String computerChoice() {

        int num = (int) (Math.random() * 3);

        if (num == 0) return "rock";
        if (num == 1) return "paper";
        return "scissors";
    }

    public static int winner(String user, String comp) {

        if (user.equals(comp))
            return 0;

        if (user.equals("rock") && comp.equals("scissors") ||
                user.equals("paper") && comp.equals("rock") ||
                user.equals("scissors") && comp.equals("paper"))
            return 1;

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        int userWin = 0;
        int compWin = 0;

        for (int i = 0; i < games; i++) {

            System.out.print("Enter choice (rock/paper/scissors): ");
            String user = sc.next();

            String comp = computerChoice();

            int result = winner(user, comp);

            if (result == 1)
                userWin++;
            else if (result == -1)
                compWin++;
        }

        System.out.println("User wins: " + userWin);
        System.out.println("Computer wins: " + compWin);

        System.out.println("User win %: " + (userWin * 100.0 / games));
        System.out.println("Computer win %: " + (compWin * 100.0 / games));
    }
}
