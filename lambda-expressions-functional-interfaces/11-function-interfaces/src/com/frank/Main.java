package com.frank;

import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {

    private static final Student FRANK = new Student(11111111111L, "Frank", 28, 11.5, true);
    private static final Student PATRIK = new Student(22222222222L, "Patrik", 27, 22.5, true);
    private static final Student JEFF = new Student(33333333333L, "Jeff", 27, 33.5, true);

    private static final List<Student> STUDENTS = List.of(FRANK, PATRIK, JEFF);

    public static void main(String[] args) {

        Function<Student, String> getName = student -> student.getName();

        IntFunction<List<Student>> getStudentsByAge = age -> getStudentsByAge(age);
        LongFunction<Student> getStudentById = id -> getStudentById(id);
        DoubleFunction<List<Student>> getStudentsByPoints = points -> getStudentsByPoints(points);

        ToIntFunction<Student> getAge = student -> student.getAge();
        ToLongFunction<Student> getId = student -> student.getId();
        ToDoubleFunction<Student> getPoints = student -> student.getPoints();

        LongToIntFunction getAgeById = id -> getAgeById(id);
        DoubleToIntFunction getAgeByPoints = points -> getAgeByPoints(points);

        IntToLongFunction getIdByAge = age -> getIdByAge(age);
        DoubleToLongFunction getIdByPoints = points -> getIdByPoints(points);

        IntToDoubleFunction getPointsByAge = age -> getPointsByAge(age);
        LongToDoubleFunction getPointsById = id -> getPointsById(id);

        BiFunction<Integer, String, List<Student>> getStudentByAgeAndName = (age, name) -> getStudentByAgeAndName(age, name);

        ToIntBiFunction<String, Double> getAgeByNameAndPoints = (name, points) -> getAgeByNameAndPoints(name, points);
        ToLongBiFunction<String, Double> getIdByNameAndPoints = (name, points) -> getIdByNameAndPoints(name, points);
        ToDoubleBiFunction<String, Integer> getPointsByNameAndAge = (name, age) -> getPointsByNameAndAge(name, age);

        System.out.println(getName.apply(FRANK));

        System.out.println(getStudentsByAge.apply(27));
        System.out.println(getStudentById.apply(11111111111L));
        System.out.println(getStudentsByPoints.apply(22.5));

        System.out.println(getAge.applyAsInt(PATRIK));
        System.out.println(getId.applyAsLong(JEFF));
        System.out.println(getPoints.applyAsDouble(FRANK));

        System.out.println(getAgeById.applyAsInt(11111111111L));
        System.out.println(getAgeByPoints.applyAsInt(11.5));

        System.out.println(getIdByAge.applyAsLong(28));
        System.out.println(getIdByPoints.applyAsLong(33.5));

        System.out.println(getPointsByAge.applyAsDouble(28));
        System.out.println(getPointsById.applyAsDouble(22222222222L));

        System.out.println(getStudentByAgeAndName.apply(28, "Frank"));

        System.out.println(getAgeByNameAndPoints.applyAsInt("Patrik", 22.5));
        System.out.println(getIdByNameAndPoints.applyAsLong("Jeff", 33.5));
        System.out.println(getPointsByNameAndAge.applyAsDouble("Frank", 28));
    }

    public static List<Student> getStudentsByAge(int age) {
        return STUDENTS.stream()
            .filter(student -> student.getAge() == age)
            .collect(Collectors.toList());
    }

    public static Student getStudentById(long id) {
        return STUDENTS.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public static List<Student> getStudentsByPoints(double points) {
        return STUDENTS.stream()
                .filter(student -> student.getPoints() == points)
                .collect(Collectors.toList());
    }

    public static int getAgeById(long id) {
        return STUDENTS.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .map(student -> student.getAge())
                .orElse(0);
    }

    public static int getAgeByPoints(double points) {
        return STUDENTS.stream()
                .filter(student -> student.getPoints() == points)
                .findFirst()
                .map(student -> student.getAge())
                .orElse(0);
    }

    public static long getIdByAge(int age) {
        return STUDENTS.stream()
                .filter(student -> student.getAge() == age)
                .findFirst()
                .map(student -> student.getId())
                .orElse(0L);
    }

    public static long getIdByPoints(double points) {
        return STUDENTS.stream()
                .filter(student -> student.getPoints() == points)
                .findFirst()
                .map(student -> student.getId())
                .orElse(0L);
    }

    public static double getPointsByAge(int age) {
        return STUDENTS.stream()
                .filter(student -> student.getAge() == age)
                .findFirst()
                .map(student -> student.getPoints())
                .orElse(0.0);
    }

    public static double getPointsById(long id) {
        return STUDENTS.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .map(student -> student.getPoints())
                .orElse(0.0);
    }

    public static List<Student> getStudentByAgeAndName(int age, String name) {
        return STUDENTS.stream()
                .filter(student -> student.getAge() == age && student.getName().equals(name))
                .collect(Collectors.toList());
    }

    public static int getAgeByNameAndPoints(String name, double points) {
        return STUDENTS.stream()
                .filter(student -> student.getName().equals(name) && student.getPoints() == points)
                .findFirst()
                .map(student -> student.getAge())
                .orElse(0);
    }

    public static long getIdByNameAndPoints(String name, double points) {
        return STUDENTS.stream()
                .filter(student -> student.getName().equals(name) && student.getPoints() == points)
                .findFirst()
                .map(student -> student.getId())
                .orElse(0L);
    }

    public static double getPointsByNameAndAge(String name, int age) {
        return STUDENTS.stream()
                .filter(student -> student.getName().equals(name) && student.getAge() == age)
                .findFirst()
                .map(student -> student.getPoints())
                .orElse(0.0);
    }
}
