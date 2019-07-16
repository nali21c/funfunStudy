package me.dragonsilver.funfun.red;

import java.util.function.Function;

import static me.dragonsilver.funfun.red.Cons.cons;
import static me.dragonsilver.funfun.red.ConsList.filter;
import static me.dragonsilver.funfun.red.ConsList.map;

public class main {

    public static void main(String[] args) {
        // ConsList
        ConsList consList = cons(1, cons(2, cons(3, ConsList.Nil)));
        ConsList consList2 = cons(1,2,3,4,5);

        // Map
        ConsList mapResult = map(Cons.Nil, consList2, (Function<Integer, Integer>) o -> o + 1);

        // Filter
        ConsList filterResult = filter(Cons.Nil, consList2, o -> {
            if (o > 3) {
                return true;
            } else {
                return false;
            }
        });

        // 출력
        System.out.println(consList);
        System.out.println(consList2);
        System.out.println(mapResult);
        System.out.println(filterResult);
    }
}



