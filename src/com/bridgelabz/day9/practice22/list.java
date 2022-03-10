package com.bridgelabz.day9.practice22;

public class list {
    public list() {
    }
    private String name;
    private int id;

    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "list{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
