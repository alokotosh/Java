package com;

import javax.swing.*;

/**
 * Created by kepler23 on 8/31/15.
 */
public class Pair<T extends Comparable>  {
    private  T first;
    private  T second;
    Pair()
    {
        first = null;
        second = null;
    }
    Pair(T first, T second)
    {
        this.second =second;
        this.first=first;
    }
    public T getFirst()
    {
        return first;
    }
    public  T getSecond()
    {
        return  second;
    }
    public void setFirst(T newValue)
    {
        first= newValue;

    }

}

class  Main {
    public static void main(String[] args) {
        Pair<String> g = new Pair<String>("d","d");
        g.setFirst("gff");
    }
}
