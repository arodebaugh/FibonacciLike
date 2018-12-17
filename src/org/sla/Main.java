package org.sla;

public class Main {

    public static void main(String[] args) {
        FibonacciLike f = new FibonacciLike();
        f.run(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
    }
}
