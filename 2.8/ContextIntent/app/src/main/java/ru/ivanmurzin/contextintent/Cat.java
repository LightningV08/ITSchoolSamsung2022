package ru.ivanmurzin.contextintent;

import java.io.Serializable;

public class Cat implements Serializable {
    private String name;
    private int paws = 4;
    private long tail = 100;

    public Cat(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("Meow " + name);
    }

    public void bite() {
        // smt
    }

    @Override
    public String toString() {
        return "I'm cat: " + name + " with paws: " + paws + " with tail: " + tail;
    }
}
