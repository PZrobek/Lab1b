package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.myLib.StringFun;

import java.util.Scanner;

public class CamelizeTest {
    public static void main(String[] args) {
        do {
            Scanner scn = new Scanner(System.in);
            System.out.print("\nPodaj tekst do po³¹czenia (E koñczy program): ");
            String tekst = scn.nextLine();
            if (tekst.equals("E")) break;
            System.out.print("Tekst: " +
                    (StringFun.camelize(tekst)));
        } while (true);
    }
}