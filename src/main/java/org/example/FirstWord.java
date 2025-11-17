package org.example;
import java.util.Scanner;
public class FirstWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int probel = str.indexOf(' ');
        String result;
        if (probel == -1) {
        result = str;
    }else {
            result = str.substring(0, probel);
        }
        System.out.println(result);
    }
}
