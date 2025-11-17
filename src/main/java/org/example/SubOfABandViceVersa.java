package org.example;
import java.util.Scanner;
public class SubOfABandViceVersa {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        int count=0;
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            char letter = str.charAt(i);

            if (letter == 'a') {
                result =result +'b';
                count ++;

            } else if (letter =='A') {

                result =result + 'B';
                count++;
            }
            else{
                result =result + letter;
            }
        }
        System.out.println(result);
        System.out.println(count);


    }
}
