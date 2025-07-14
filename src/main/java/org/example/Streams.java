package org.example;

import java.util.List;
import java.util.Optional;

public class Streams {

    public void task1(List<Integer> numbers){
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }

    public List<String> task2(List<String> words){
        return words.stream()
                .map(String::toUpperCase)
                .toList();
    }

    public long task3(List<Integer> numbers){
        return numbers.stream()
                .filter(number -> number > 5)
                .count();
    }

    public Optional<Integer> task4(List<Integer> numbers){
        return numbers.stream()
                .filter(number -> number > 3)
                .findFirst();
    }

    public boolean task5(List<Integer> numbers){
        return numbers.stream()
                .allMatch(number -> number > 0);
    }

}
