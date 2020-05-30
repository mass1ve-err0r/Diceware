package de.saadatbaig.DicewareJ.Utils;

import de.saadatbaig.DicewareJ.Models.DicewareMap;
import java.util.concurrent.ThreadLocalRandom;

public class DicewarePassGen {

    public int generateSingularRandomNumber(int _min, int _max) {
        return ThreadLocalRandom.current().nextInt(_min, _max);
    }

    /* End */
}
