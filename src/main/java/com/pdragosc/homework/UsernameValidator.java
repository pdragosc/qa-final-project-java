package com.pdragosc.homework;

import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;
        boolean valid;

        do {
            valid = true;

            System.out.print("Introdu un username: ");
            username = scanner.nextLine();

            //lungimea
            if (username.length() < 6 || username.length() > 12) {
                System.out.println("Eroare:Usernameul trebuie sa aiba intre 6 si 12 caractere.");
                valid = false;
            } else {
                //fara spatii
                boolean areSpatiu = false;
                for (int i = 0; i < username.length(); i++) {
                    char c = username.charAt(i);
                    if (c == ' ') {
                        areSpatiu = true;
                    }
                }

                if (areSpatiu) {
                    System.out.println("Eroare:Usernameul nu poate contine spatii.");
                    valid = false;
                } else {
                    //cel putin o cifra
                    boolean areCifra = false;
                    for (int i = 0; i < username.length(); i++) {
                        char c = username.charAt(i);
                        if (c >= '0' && c <= '9') {
                            areCifra = true;
                        }
                    }

                    if (!areCifra) {
                        System.out.println("Eroare:Usernameul trebuie sa contina cel putin o cifra.");
                        valid = false;
                    }
                }
            }

            System.out.println();

        } while (!valid);

        System.out.println("Username acceptat: " + username);
        scanner.close();
    }
}
