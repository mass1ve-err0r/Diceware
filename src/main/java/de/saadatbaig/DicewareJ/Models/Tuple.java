package de.saadatbaig.DicewareJ.Models;

public class Tuple<T1, T2> {

    private final T1 first;
    private final T2 second;

    public Tuple(T1 _first, T2 _second) {
        first = _first;
        second = _second;
    }

    public T1 getFirst() { return first; }
    public T2 getSecond() { return second; }

    /* End */
}
