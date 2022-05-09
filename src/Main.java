import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

       // Sta sta = new Sta();
       // sta.ad();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число : ");
        int d = sc.nextInt();
        test(d);
      //  prMen();
    }
    static void test(int age) {
       // Scanner sc = new Scanner(System.in);

      //  int age = sc.nextInt();
        if (age >= 17)
            System.out.println("PRAWELN");
         else
            System.out.println("NET");

    }

    private static void prMen() {

        System.out.println("MENU :\n" +
       "1. ADD\n" +
        "2. MULT\n");

    }

    }


