package org.example;
import java.util.Scanner;
public class LastWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        int lastprobel = str.lastIndexOf(' ');
        String lastWord;
        if (lastprobel == -1) {
            System.out.println(str);
        } else {
            System.out.println(str.substring(lastprobel+1));
        }

    }
}
