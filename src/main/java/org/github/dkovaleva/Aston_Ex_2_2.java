package org.github.dkovaleva;

import java.util.Scanner;

public class Aston_Ex_2_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

    }
}


