package com.employee.crud.entity;

public class User {
    private int id;
    private String name;
    private int age;
    private String gerder;

    public void setAge(int age) {
        this.age = age;
    }

    public void setGerder(String gerder) {
        this.gerder = gerder;
    }

    public int getAge() {
        return age;
    }

    public String getGerder() {
        return gerder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(int id, String name, int age, String gerder) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gerder = gerder;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gerder='" + gerder + '\'' +
                '}';
    }
}
