package me.dragonsilver.funfun.red;

public class Cons<T> extends ConsList<T> {

    private T head;
    private ConsList<T> tail;

    public Cons(T head, ConsList<T> tail) {
        this.head = head;
        this.tail = tail;
    }

    public static <T> Cons<T> cons(T head, ConsList<T> tail) {
        return new Cons<>(head, tail);
    }

    // 가변인자
    public static <T> ConsList<T> cons(T... t) {
        ConsList<T> result = Nil;
        for (int i = t.length -1; i >= 0; i--) {
            result = cons(t[i], result);
        }
        return result;
    }

    @Override
    public T head() {
        return head;
    }

    @Override
    public ConsList<T> tail() {
        return tail;
    }

}
