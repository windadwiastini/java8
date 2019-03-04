package com.mitrais.pbi2;

import java.util.function.*;

public class FunctionalInterfaceDemo {
    public void startDemo() {
        System.out.println("===Predicate interface===");
        Predicate<Integer> isEven = (num) -> num%2==0;
        System.out.println(isEven.test(4) ? "Even" : "Odd");

        System.out.println("===Function interface===");
        Function<Double, Double> multiplier = (value) -> value * 3.0;
        System.out.println(multiplier.apply(4d));

        System.out.println("===Binary Operator interface===");
        BinaryOperator<Double> additional = (value1, value2) -> {
            value1 += value2;
            return value1;
        };
        System.out.println(additional.apply(10d,18.8));

        System.out.println("===Consumer interface===");
        Consumer<Double> checkGrade = (score) -> System.out.println(score>75 ? "Passed" : "Not Passed");
        checkGrade.accept(80d) ;
        checkGrade.accept(75d);

        System.out.println("===Supplier interface===");
        Supplier<String> teamName = () -> "Team Saras 008";
        System.out.println(teamName.get());
    }

}
