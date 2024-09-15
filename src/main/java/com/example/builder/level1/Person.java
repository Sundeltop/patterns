package com.example.builder.level1;

public class Person {

    private final String name;
    private final int age;

    public Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static class Builder {

        private String name;
        private int age;

        public Builder name(String name) {
            this.name = name;

            return this;
        }

        public Builder age(int age) {
            this.age = age;

            return this;
        }

        public Builder() {
        }

        public Person build() {
            return new Person(this);
        }
    }
}
