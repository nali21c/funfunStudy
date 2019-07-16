package me.dragonsilver.funfun.red;

import java.util.function.Function;

import static me.dragonsilver.funfun.red.Cons.cons;
import static me.dragonsilver.funfun.red.ConsList.map;

public class main {

    public static void main(String[] args) {
        ConsList consList = cons(1, cons(2, cons(3, ConsList.Nil)));
        ConsList consList2 = cons(1,2,3,4,5);
        ConsList mapResult = map(Cons.Nil, consList2, (Function<Integer, Integer>) o -> o + 1);
        System.out.println(consList);
        System.out.println(consList2);
        System.out.println(mapResult);

        System.out.println("aaaa");
    }
}



