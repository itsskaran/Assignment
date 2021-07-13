package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public  class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstname, lastname;
        int id;
        System.out.print("How many players are you going to enter?");
        int n = input.nextInt();
        athlete a1[] = new athlete[n];
        for (int i = 0; i < n; i++) {
            List<Integer> score = new ArrayList<Integer>();
            System.out.print("Enter player first name ");
            firstname = input.next();
            System.out.print("Enter player last name ");
            lastname = input.next();
            System.out.print("Enter player Id number ");
            id = input.nextInt();
            int j = 0;
            while (j != 1) {
                System.out.print("Enter the games score per game of the player , press 1 to end ");
                j = input.nextInt();
                if (j != 1) {
                    score.add(j);
                }
            }
            Integer[] scores = new Integer[score.size()];
            for (int k =0; k < score.size(); k++)
                scores[k] = score.get(k);
            a1[i]=new athlete(firstname, lastname, id, scores);
        }
        System.out.println("Player\t\tStats\n****************************************");
        for (int i = 0; i < n; i++) {
            a1[i].calc_average();
            a1[i].display();
        }
    }
}