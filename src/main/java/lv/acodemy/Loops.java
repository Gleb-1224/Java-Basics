package lv.acodemy;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class Loops {
    public static void main(String[] args) {

        // for; do while, foreach, while;

        for (int i = 0;  i < 10; i++){
            System.out.println("Hello World");
        }

        String[] fruits  = {"Apple", "banana","kiwi", "orange","pear"};
        //fruits[0] = apple

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
           if(fruits[i].equals("kiwi")) {
               System.out.println("I found kiwi!");
               break;
           }
        }
        
        // enhanced for
        
        for(String fruit : fruits) {
            System.out.println("fruit = " + fruit);
        }

        // Print the numbers from 20 to 40
        // Colculate the sum of all even numbers

        for (int i = 20;  i <= 40; i++){
            System.out.println(i);
        }

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum of even numbers:" + sum);

        // Print the multiplication table of a given number

        //6;

        int number = 6;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i * number + " ");
            }

        // TODO: Multiplication table 10;

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10 ; j++) {
                System.out.println(i * j + " ");
            }
             // While LOOP


        }

        //TODO: Limit guess with 3 times;


        String name = "Gleb";
        String reversed = "";
        for (int l = name.length() - 1; l >= 0 ; l--) {
           reversed = reversed + name.charAt(l);

        }
        System.out.println(reversed);

    }

}


