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

    public static String camelize(String str) {
        char[] cPhrase = str.toCharArray();
        for (int i = 0; i < cPhrase.length; i++) {
            if (i == 0 && Character.isUpperCase(cPhrase[i])) {
                cPhrase[i] = Character.toLowerCase(cPhrase[i]);
            }
            if (cPhrase[i] == ' ' && cPhrase.length != i + 1) {
                cPhrase[i + 1] = Character.toUpperCase(cPhrase[i + 1]);
            }
        }
        String cPhraseString = new String(cPhrase);
        cPhraseString = cPhraseString.replace(" ", "");
        return cPhraseString;
    }
}
