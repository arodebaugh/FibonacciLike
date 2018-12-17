package org.sla;

public class FibonacciLike {
    public int max = 40;
    public int first = 0;
    public int second = 1;
    public int[] sequence = new int[max];

    private String printOut;

    public void run(int m, int f, int s) {
        max = m;
        first = f;
        second = s;

        sequence[0] = first;
        sequence[1] = second;

        for (int x = 2; x <= max - 1; x++) {
            int pattern = sequence[x - 1] + sequence[x - 2];
            sequence[x] = pattern;
        }

        printOut(0);

       /* printOut = String.valueOf(sequence[0]);

        for (int x = 1; x <= max-2; x++) {
            printOut += ", " + sequence[x];
        }

        System.out.println(printOut);*/
    }

    void printOut(int n) {
        if (n == 0) {
            printOut = String.valueOf(sequence[0]);
            printOut(n + 1);
        } else if (n < (max - 2)) {
            printOut += ", " + sequence[n];
            printOut(n + 1);
        } else if (n == (max - 2)) {
            printOut += ", " + sequence[n];
            System.out.println(printOut);
        }
    }
}
