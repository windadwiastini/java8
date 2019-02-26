package com.mitrais.pbi2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaDemo {
    public static void main(String[] args) {
        System.out.println("===Anonymous Inner Class===");
        NumberOperation numberOperation = new NumberOperation() {
            @Override
            public double multiply(double a, double b) {
                return a*b;
            }
        };
        System.out.println(numberOperation.multiply(10.8 , 9.1));

        System.out.println("===Lambda Expression===");
        NumberOperation multiplier = (a, b) -> a*b;
        System.out.println(multiplier.multiply(8.5, 4.8));

        System.out.println("===Sorting number===");
        List<Double> numbers = Arrays.asList(3.5, 4.1, 1.0, 1.1, 2.0, 6.8, 8.1);
        numbers.sort((a1, a2) -> a2.compareTo(a1));
        numbers.forEach(System.out::println);

        System.out.println("===Filtering number===");
        Predicate<Double> filterMe = (a) -> a.compareTo(2d) > 0;
        numbers.forEach((number)->{
            if(filterMe.test(number))
                System.out.println(number);
        });

        System.out.println("===Modifying value===");
        List<String> country = new ArrayList<>();
        country.add("India");
        country.add("U.S.A");
        country.add("Thailand");
        country.add("Bali");

        List<String> modifiedCountry = country.stream()
                                        .map((name) -> (name == "Bali") ? "Indonesia":name)
                                        .collect(Collectors.toList());
        modifiedCountry.forEach(System.out::println);
    }
}
