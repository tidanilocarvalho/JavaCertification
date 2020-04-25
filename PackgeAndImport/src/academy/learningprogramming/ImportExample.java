package academy.learningprogramming;

import a.b.c.d.*;

import java.util.*;

public class ImportExample {

    public static void main(String[] args) {
        Random random = new Random();

        /**
         * java.lang is special
         * it is import automatically
         */
        System.out.println(random.nextInt(5));

        ///Integer

        ExampleClass exampleClass = new ExampleClass();
        MyClass myclass = new MyClass();
    }
}
