package org.example;
import java.util.Scanner;
public class HowManyWords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();

       String [] words=str.split(" ");
       int count=0;
        for (int i = 0; i <words.length ; i++) {
            String word=words[i];
            if(!word.isEmpty()){
                count++;

        }

        }
        System.out.println(count);
    }
}
