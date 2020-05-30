package de.saadatbaig.DicewareJ.Controllers;

import de.saadatbaig.DicewareJ.Models.Tuple;
import de.saadatbaig.DicewareJ.Utils.DicewarePassGen;
import de.saadatbaig.DicewareJ.Views.HomeView;


public class HomeViewController {

    HomeView hv;
    DicewarePassGen dwManager;

    public HomeViewController(HomeView _hv) {
        hv = _hv;
        hv.lateinit();
        dwManager = new DicewarePassGen();
    }

    public void generatePassword(int _wc, boolean subWhitespaces, boolean addNums) {
        String[] usedWords = dwManager.getWords(_wc);
        String rv_s = dwManager.createSpacedString(usedWords);

        if (subWhitespaces) {
            rv_s = dwManager.substituteContentsWithSpecials(rv_s, 1);
        } else {
            rv_s = dwManager.substituteContentsWithSpecials(rv_s, 3);
        }

        if (addNums) {
            rv_s = dwManager.substituteContentsWithSpecials(rv_s, 2);
        }

        Tuple<String[], String> rv = new Tuple<>(usedWords, rv_s);
        hv.showPassword(rv);
    }

    /* End */
}
