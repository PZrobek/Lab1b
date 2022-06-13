package pl.lublin.wsei.java.cwiczenia.myLib;

public class StringFun {

    public static String anarchize(String str){
        int count = 0;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char t = str.charAt(i);
            if (Character.isLetter(t) && (count++) % 2 == 0) {
                sb.append(Character.toUpperCase(t));
            } else {
                sb.append(t);
            }
        }
        return sb.toString();
    }
}
