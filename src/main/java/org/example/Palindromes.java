package org.example;
import java.util.Scanner;
public class Palindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        boolean Palindrome=true;
        int n=str.length();
        for (int i = 0; i <n/2 ; i++) {
            if(str.charAt(i) !=str.charAt(n-1-i)){
                Palindrome=false;
                break;
            }

        }
        if(Palindrome){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
