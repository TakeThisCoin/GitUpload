package org.example;

public class People {
    //people
    // new version
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

        // ok
        // not ok
        this.age = age;
        this.height = height;

        // hunk 2
    }
}
