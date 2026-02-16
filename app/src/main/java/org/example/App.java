package org.example;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    TodoList list = new TodoList();
    Scanner sc = new Scanner(System.in);
    String op = "";

    while (!op.equals("5")) {
      System.out.print("\n1.Add  2.Done  3.View  4.Clear 5.Exit: ");
      op = sc.nextLine();
      try {
        if (op.equals("1")) {
          System.out.print("Enter task: ");
          list.add(sc.nextLine());
        }
        else if (op.equals("2")) {
          System.out.print("Enter task number: ");
          list.complete(Integer.parseInt(sc.nextLine()));
        }
        else if (op.equals("3")) {
          list.show("all");
        }
        else if (op.equals("4")) {
          list.clear();
        }
      } catch (Exception e) {
        System.out.println("Invalid Input");
      }
    }
    sc.close();
  }
}