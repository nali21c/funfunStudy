package me.dragonsilver.funfun.red;

import java.util.function.Function;

public abstract class ConsList<T> {

    public static Nil Nil = new Nil();


    abstract public  T head();

    abstract public ConsList<T> tail();

    @Override
    public String toString() {
        return "ConsList{" +
                "head=" + head() +
                ", tail=" + tail() +
                '}';
    }

    public static  <T, R> ConsList<R> map (ConsList<R> acc, ConsList<T> list, Function<T, R> predicate) {
           if ( list == Nil) {
               return acc;
           } else {
               return map(new Cons<R>(predicate.apply(list.head()), acc) ,list.tail(), predicate);
           }
    }

    // filter, sequence
    // stream 은 레이지하게
    // 다음주 sequence

}


