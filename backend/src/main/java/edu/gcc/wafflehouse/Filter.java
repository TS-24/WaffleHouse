package edu.gcc.wafflehouse;
import java.util.ArrayList;

public abstract class Filter<T> {
    public abstract ArrayList<T> apply(ArrayList<T> data, String pattern);
}
