package com.example.SpringBootProgram.Exemple01.Model;

public class Person {
    private final long id;
    private final String content;

    public Person(long id, String content) {
        this.id = id;
        this.content = content;
    }
    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}

