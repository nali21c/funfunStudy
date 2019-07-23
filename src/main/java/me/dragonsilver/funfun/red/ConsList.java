package me.dragonsilver.funfun.red;

import java.util.function.Function;
import java.util.function.Predicate;

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
           if (list == Nil) {
               return acc.reverse(Nil);
           } else {
               return map(new Cons<R>(predicate.apply(list.head()), acc) ,list.tail(), predicate);
           }
    }

    public ConsList<T> reverse(ConsList<T> acc) {
        if (this instanceof Nil) {
            return acc;
        } else {
            ConsList<T> temp = acc;
            acc = new Cons<>(this.head(), temp);
            return this.tail().reverse(acc);
        }
    }

    public static <T> ConsList<T> filter(ConsList<T> acc, ConsList<T> list, Predicate<T> predicate) {
        if (list == Nil) {
            return acc.reverse(Nil);
        } else {
            ConsList<T> temp;
            if (predicate.test(list.head())) {
                temp = new Cons<>(list.head(), acc);
            } else {
                temp = acc;
            }
            return filter(temp, list.tail(), predicate);
        }
    }

    public static <T> int sum(ConsList<T> acc) {
        if (acc == Nil) {
            return acc;
        } else {

            return sum(new Cons<T>(list.head() + list.tail(), acc), list.tail());
        }
    }



    // filter, sequence
    // stream 은 레이지하게
    // 다음주 sequence

}


