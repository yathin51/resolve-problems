package org.example.coalition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChangeTheCase {

    private Logger log = LoggerFactory.getLogger(ChangeTheCase.class);
    public String changeCase(String variableTOChange) {
        char[] charArray = variableTOChange.toCharArray();
        System.out.println(charArray);

        log.info("The details : {}",charArray);

        StringBuffer sb = new StringBuffer();
        for (char c : charArray) {
            if (Character.isUpperCase(c)){
                sb.append(Character.toLowerCase(c));
                continue;
            }
            if (Character.isLowerCase(c)){
                sb.append(Character.toUpperCase(c));
                continue;
            }
            sb.append(c);
        }
        return sb.toString();

    }

    public static void main(String... args) {

        ChangeTheCase changeTheCase = new ChangeTheCase();

        String variableTOChange = "CaBz";
        System.out.println(changeTheCase.changeCase(variableTOChange));

    }
}