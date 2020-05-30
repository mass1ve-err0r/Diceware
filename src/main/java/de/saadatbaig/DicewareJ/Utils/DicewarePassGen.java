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

    /* End */
}
