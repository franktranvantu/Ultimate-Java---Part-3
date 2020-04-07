package com.frank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Course> courses = Arrays.asList(
            new Course("Computer Science ",
                Arrays.asList(
                    new Student("John", 34),
                    new Student("Marry", 23),
                    new Student("Vice", 15)
                )),
            new Course("Statistical 101",
                Arrays.asList(
                    new Student("John II", 17),
                    new Student("Marry II", 22),
                    new Student("Vice II", 60)
                )),
            new Course("Computer Science Advanced",
                Arrays.asList(
                    new Student("John III", 21),
                    new Student("Marry III", 32),
                    new Student("Vice", 34)
                ))
        );

        List<String> titles = courses.stream()
                .map(course -> course.getTitle())
                .collect(Collectors.toList());

        List<Student> students = courses.stream()
                .flatMap(course -> course.getStudents().stream())
                .collect(Collectors.toList());

        titles.forEach(System.out::println);
        students.forEach(System.out::println);
    }
}
