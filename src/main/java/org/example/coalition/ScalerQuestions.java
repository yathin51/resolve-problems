package org.example.coalition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ScalerQuestions {

    private static Logger log = LoggerFactory.getLogger(ScalerQuestions.class);

    void function() {
        int i = 0;
        int sum = 0;
        while (i < 100) {
            sum = sum + i;
            sum = i + sum;
            i += 1;
        }
        log.info("{}", sum);
    }

    public static void main(String[] args) {
        ScalerQuestions scalerQuestions = new ScalerQuestions();
        scalerQuestions.function();
        log.info("{}", fun(100, 2000));
        log.info("{}", scalerQuestions.fib(6));

        for (int i = 0; i < 6; i++) {
            log.info("", printTribRec(i));
        }

    }

    int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);

    }

    static int fun(int a, int b) {
        if (b == 0)
            return a;
        else return fun(b, a % b);
    }

    static int printTribRec(int n) {
        if (n == 0 || n == 1 || n == 2)
            return 0;
        if (n == 3)
            return 1;
        else
            return printTribRec(n - 1) + printTribRec(n - 2) + printTribRec(n - 3);
    }
}