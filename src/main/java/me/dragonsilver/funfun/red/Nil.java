package me.dragonsilver.funfun.red;

import java.util.NoSuchElementException;

public class Nil<T> extends ConsList<T> {

    public Nil() { }

    @Override
    public T head() {
        throw new NoSuchElementException("head of EmptyList");
    }

    @Override
    public ConsList<T> tail() {
        throw new UnsupportedOperationException("tail of EmptyList");
    }

    @Override
    public String toString() {
        return "Nil";
    }

}
