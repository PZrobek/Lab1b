package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.myLib.StringFun;

import java.util.Scanner;

public class IsAnarchizeTest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Podaj tekst do zamiany: ");
        String tekst = scn.nextLine();
            System.out.print("Tekst: " +
                    (StringFun.anarchize(tekst)));

    }
}
