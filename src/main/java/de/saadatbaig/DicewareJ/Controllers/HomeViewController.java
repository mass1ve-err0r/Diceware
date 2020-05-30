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



    /* End */
}
