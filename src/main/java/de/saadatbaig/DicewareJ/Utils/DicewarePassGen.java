package de.saadatbaig.DicewareJ.Utils;

import de.saadatbaig.DicewareJ.Models.DicewareMap;
import java.util.concurrent.ThreadLocalRandom;

public class DicewarePassGen {

    private final char[] specials = new char[] {'<', '(', '{', '[', '\\', '^', '-', '=', '$', '!', '|', ']', '}', ')', '?', '+', '*', '.', '>', '_'};
    private final char[] exchangeables = new char[] {'a', 'b', 'e', 'z', 's', 't', 'i', 'g', 'o'};
    DicewareMap dwMap;

    public DicewarePassGen() {
        dwMap = new DicewareMap();
    }

    public String createSpacedString(String[] words) {
        return String.join(" ", words);
    }

    public String[] getWords(int amount) {
        String[] rv = new String[amount];
        for (int i = 0; i < rv.length; i++) {
            String key_s = generateRandomNumberString(1, 7);
            String dwWord = dwMap.getWordFromKey(key_s);
            rv[i] = dwWord;
        }
        return rv;
    }

    public String generateRandomNumberString(int _min, int _max) {
        StringBuilder rv = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            int rNum = generateSingularRandomNumber(_min, _max);
            rv.append(rNum);
        }
        return rv.toString();
    }

    public int generateSingularRandomNumber(int _min, int _max) {
        return ThreadLocalRandom.current().nextInt(_min, _max);
    }

    public String substituteContentsWithSpecials(String password, int mode) {
        StringBuilder rv = new StringBuilder(password);
        if (mode == 1) {
            for(int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (c == ' ') {
                    int rNum = generateSingularRandomNumber(1, 20);
                    rv.setCharAt(i, specials[rNum]);
                }
            }
        }
        else if (mode == 2) {
            for(int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (isInExchangeables(c)) {
                    int rNum = generateSingularRandomNumber(0, 10);
                    rv.setCharAt(i, Character.forDigit(rNum, 10));
                }
            }
        } else {
            for(int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (c == ' ') {
                    rv.setCharAt(i, '_');
                }
            }
        }
        return rv.toString();
    }

    private boolean isInExchangeables(char c) {
        for (char x : exchangeables) {
            if (x == c) {
                return true;
            }
        }
        return false;
    }

    /* End */
}
