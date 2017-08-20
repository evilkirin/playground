package indy;

import java.util.function.Consumer;

class Foo {
    int i;

    void bar(int j) {
        Consumer consumer = k -> {
            System.out.println(k);
            System.out.println(i + j);
        };

        consumer.accept(11);
    }
}