package com.frank;

public class Student {

    private final long id;
    private final String name;
    private final int age;
    private final double points;
    private final boolean isMale;

    public Student(long id, String name, int age, double points, boolean isMale) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.points = points;
        this.isMale = isMale;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getPoints() {
        return points;
    }

    public boolean isMale() {
        return isMale;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", points=" + points +
                ", isMale=" + isMale +
                '}';
    }
}
