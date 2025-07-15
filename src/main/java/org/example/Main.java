package org.example;

import org.example.person.Person;
import org.example.person.PersonStreams;
import org.example.product.Product;
import org.example.product.ProductStreams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Streams streams = new Streams();
        PersonStreams personStreams = new PersonStreams();
        ProductStreams productStreams = new ProductStreams();

        //create people
        List<Person> people = new ArrayList<>();

        Person p1 = new Person();
        p1.setName("Alice");
        p1.setAge(25);

        Person p2 = new Person();
        p2.setName("Bob");
        p2.setAge(30);

        Person p3 = new Person();
        p3.setName("Charlie");
        p3.setAge(22);

        Person p4 = new Person();
        p4.setName("Diana");
        p4.setAge(27);

        Person p5 = new Person();
        p5.setName("Ethan");
        p5.setAge(35);

        Person p6 = new Person();
        p6.setName("Fiona");
        p6.setAge(28);

        Person p7 = new Person();
        p7.setName("George");
        p7.setAge(40);

        Person p8 = new Person();
        p8.setName("Hannah");
        p8.setAge(19);

        Person p9 = new Person();
        p9.setName("Ian");
        p9.setAge(33);

        Person p10 = new Person();
        p10.setName("Julia");
        p10.setAge(26);

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);
        people.add(p6);
        people.add(p7);
        people.add(p8);
        people.add(p9);
        people.add(p10);

        //create Products
        List<Product> products = new ArrayList<>();

        Product product1 = new Product();
        product1.setName("Laptop");
        product1.setPrice(1200.0);
        product1.setCategory("Electronics");

        Product product2 = new Product();
        product2.setName("Smartphone");
        product2.setPrice(800.0);
        product2.setCategory("Electronics");

        Product product3 = new Product();
        product3.setName("TV");
        product3.setPrice(1500.0);
        product3.setCategory("Electronics");

        Product product4 = new Product();
        product4.setName("Desk Chair");
        product4.setPrice(150.0);
        product4.setCategory("Furniture");

        Product product5 = new Product();
        product5.setName("Table");
        product5.setPrice(250.0);
        product5.setCategory("Furniture");

        Product product6 = new Product();
        product6.setName("Couch");
        product6.setPrice(500.0);
        product6.setCategory("Furniture");

        Product product7 = new Product();
        product7.setName("Bread");
        product7.setPrice(2.5);
        product7.setCategory("Grocery");

        Product product8 = new Product();
        product8.setName("Milk");
        product8.setPrice(1.5);
        product8.setCategory("Grocery");

        Product product9 = new Product();
        product9.setName("Coffee");
        product9.setPrice(10.0);
        product9.setCategory("Grocery");

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);
        products.add(product9);

        //task1
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        streams.task1(numbers);

        //task2
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        System.out.println(streams.task2(words));

        //task3
        System.out.println(streams.task3(numbers));

        //task4
        System.out.println(streams.task4(numbers));

        //task5
        List<Integer> numbers5 = Arrays.asList(-1, 0, 2, 3);
        System.out.println(streams.task5(numbers5));

        //task6
        System.out.println(personStreams.task6(people));

        //task7
        System.out.println(personStreams.task7(people));

        //task8
        System.out.println(personStreams.task8(people));

        //task9
        System.out.println(personStreams.task9(people));

        //task10
        System.out.println(personStreams.task10(people));

        //task11
        List<List<Integer>> listNumbers = new ArrayList<>();
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5);
        List<Integer> list3 = Arrays.asList(6, 7, 8, 9);
        listNumbers.add(list1);
        listNumbers.add(list2);
        listNumbers.add(list3);

        System.out.println(streams.task11(listNumbers));

        //task12
        List<String> listWords = Arrays.asList(
                "apple", "banana", "orange", "apple",
                "grape", "banana", "pear", "kiwi",
                "mango", "grape", "apple", "lemon"
        );

        System.out.println(streams.task12(listWords));

        //task13
        System.out.println(personStreams.task13(people));

        //task14
        List<Integer> numbers13 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(streams.task14(numbers13));

        //task15
        System.out.println(personStreams.task15(people, "A", 19));

        //task16
        System.out.println(streams.task16(words));

        //task17
        System.out.println(streams.task17(words));

        //task18
        System.out.println(streams.task18(words));

        //task19
        System.out.println(streams.task19(words));

        //task20
        System.out.println(streams.task20(words));

        //task21
        System.out.println(streams.task21(numbers13));

        //task22
        System.out.println(streams.task22(numbers13));

        //task23
        System.out.println(streams.task23(numbers13));

        //task24
        System.out.println(streams.task24(numbers13));

        //task25
        System.out.println(streams.task25(5));

        //task26
        System.out.println(productStreams.task26(products));

        //task27
        System.out.println(productStreams.task27(products, 4));

        //task28
        System.out.println(streams.task28(numbers13));

        //task29
        System.out.println(personStreams.task29(people));

        //task30
        System.out.println(streams.task30(words));
    }

}