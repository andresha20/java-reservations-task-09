package org.example.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {


    public static Boolean searchRegexCoincidence(String value, String regExpression) {
        Pattern regex = Pattern.compile(regExpression);
        Matcher coincidence = regex.matcher(value);
        return coincidence.matches();
    }

    public Util() {
    }
}
