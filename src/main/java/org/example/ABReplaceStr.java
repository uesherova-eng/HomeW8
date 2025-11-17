package org.example;
import java.util.Scanner;
public class ABReplaceStr {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String str=scanner.nextLine();
        int count=0;
        for (int i = 0; i <str.length() ; i++) {

               if(str.charAt(i)=='a') {
               count ++;
            }
        }

        String replace=(str.replace('a', 'b'));
        System.out.println(replace);
        System.out.println(count);
    }
}
