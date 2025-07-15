package org.example;

import java.util.Comparator;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

    public List<Integer> task11(List<List<Integer>> numbers){
        return numbers.stream()
                .flatMap(number -> number.stream())
                .collect(Collectors.toList());
    }

    public List<String> task12(List<String> words){
        return words.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    //четные - true, нечет - false
    public Map<Boolean, List<Integer>> task14(List<Integer> numbers){
        return numbers.stream()
                .collect(Collectors.partitioningBy(number -> number % 2 == 0));
    }

    public String task16(List<String> strings){
        return strings.stream()
                .collect(Collectors.joining(","));
    }

    public Optional<String> task17(List<String> strings){
        return strings.stream()
                .max(Comparator.comparingInt(String::length));
    }

    public long task18(List<String> strings){
        return strings.stream()
                .mapToInt(String::length)
                .sum();
    }

    public List<String> task19(List<String> strings){
        return strings.stream()
                .filter(string -> string.length() > 5)
                .collect(Collectors.toList());
    }

    public List<String> task20(List<String> strings){
        return strings.stream()
                .map(s -> s.isEmpty() ? "" : s.substring(0, 1))
                .collect(Collectors.toList());
    }

    public int task21(List<Integer> numbers){
        return numbers.stream()
                .mapToInt(number -> number * number)
                .sum();
    }

    public Optional<Integer> task22(List<Integer> numbers) {
        return numbers.stream()
                .reduce((a, b) -> a * b);
    }

    public Map<String, Integer> task23(List<Integer> numbers) {
        return numbers.stream()
                .collect(Collectors.teeing(
                        Collectors.minBy(Integer::compareTo),
                        Collectors.maxBy(Integer::compareTo),
                        (minOpt, maxOpt) -> {
                            Map<String, Integer> result = new HashMap<>();
                            result.put("min", minOpt.orElse(null));
                            result.put("max", maxOpt.orElse(null));
                            return result;
                        }
                ));
    }

    public IntSummaryStatistics task24(List<Integer> numbers){
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
    }

    public int task25(int number){
        return IntStream.rangeClosed(1, number)
                .reduce(1, (a, b) -> a * b);
    }

}
