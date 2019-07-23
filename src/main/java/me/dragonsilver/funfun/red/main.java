package me.dragonsilver.funfun.red;

import java.util.function.Function;
import java.util.function.Predicate;

import static me.dragonsilver.funfun.red.Cons.cons;
import static me.dragonsilver.funfun.red.ConsList.*;

public class main {

    public static void main(String[] args) {
        // ConsList
        ConsList consList = cons(1, cons(2, cons(3, ConsList.Nil)));
        ConsList consList2 = cons(1,2,3,4,5);

        // Map
        ConsList mapResult = map(Cons.Nil, consList2, (Function<Integer, Integer>) o -> o + 1);

        // Reverse
        ConsList consList3 = consList2.reverse(Nil.Nil);

        // Filter
        ConsList filterResult = filter(Cons.Nil, consList2, (Predicate<Integer>) o -> {
            if (o > 2) {
                return true;
            } else {
                return false;
            }
        });

        // Sum
//        ConsList sumResult = sum(Cons.Nil, consList);

        // 출력
        System.out.println(consList);
        System.out.println(consList2);
        System.out.println(mapResult);
        System.out.println(consList3);
        System.out.println(filterResult);
        System.out.println(sumResult);
    }
}



