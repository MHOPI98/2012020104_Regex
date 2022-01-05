package opi;

import java.util.regex.*;
public class Main {

    public static void main(String[] args) {


        Pattern patternType = Pattern.compile("http[s]?:\\/\\/w{3}.*\\.[a-z]{2,3}");
        String opi= "Welcome to https://www.lus.ac.bd Leading University";
        Matcher mat= patternType.matcher(opi);
        opi=mat.replaceAll("");
        System.out.println(opi);
    }
}
