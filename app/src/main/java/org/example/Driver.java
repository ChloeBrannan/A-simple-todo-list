package org.example;

import java.util.Scanner;

public class Driver {
    private static String all;

    public static void main(String[] args) {
        App app = new App();
        Scanner sc = new Scanner(System.in);
        String op = "";

        while (!op.equals("5")) {
            System.out.print("\n1.Add  2.Done  3.View  4.Clear 5.Exit: ");
            op = sc.nextLine();
            try {
                if (op.equals("1")) { app.add(sc.nextLine()); }
                else if (op.equals("2")) { app.complete(Integer.parseInt(sc.nextLine())); }
                else if (op.equals("3")) { app.show(all); }
                else if (op.equals("4")) { app.clear(); }
            } catch (Exception e) { System.out.println("Invalid Input"); }
        }
    }
}