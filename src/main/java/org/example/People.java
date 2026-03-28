package org.example;

public class People {
    int age;
    int height;
    String name;

    People(int age, int height, String name) {
        this.age = age;
        this.height = height;
    }

    People(int age, int height) {
        // stash
        // 2 line
        this.age = age;
        this.height = height;
    }
}
