package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonStreams {

    public List<Person> task6(List<Person> people) {
        return people.stream()
                .filter(person -> person.getAge() > 18)
                .collect(Collectors.toList());
    }

    public List<Person> task7(List<Person> people){
        return people.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());
    }

    public Map<Integer, List<Person>> task8(List<Person> people){
        return people.stream()
                .collect(Collectors.groupingBy(Person::getAge));
    }

    public List<String> task9(List<Person> people){
        return people.stream()
                .map(person -> person.getName())
                .collect(Collectors.toList());
    }

    public double task10(List<Person> people){
        return people.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);
    }

    public Map<String, Integer> task13(List<Person> people){
        return people.stream()
                .collect(Collectors.toMap(Person::getName, Person::getAge));
    }

    public List<Person> task15(List<Person> people, String prefix, int age){
        return people.stream()
                .filter(person -> person.getName().startsWith(prefix)
                        && person.getAge() > age)
                .toList();
    }

}
