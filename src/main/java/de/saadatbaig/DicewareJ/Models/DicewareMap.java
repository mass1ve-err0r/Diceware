package de.saadatbaig.DicewareJ.Models;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DicewareMap {

    public Properties dwMap = new Properties();

    public DicewareMap() {
        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("diceware.properties");
            dwMap.load(inputStream);
        } catch (IOException ioe) {
            System.out.println("Error during initialization of diceware wordlist. Aborting...");
            System.exit(100);
        }
    }

    public String getWordFromKey(String key) {
        return dwMap.getProperty(key, null);
    }

    /* End */
}
