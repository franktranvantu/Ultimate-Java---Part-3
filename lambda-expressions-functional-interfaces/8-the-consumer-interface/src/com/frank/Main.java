package com.frank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class Main {

    private static final Teacher HAI = new Teacher("Hai");

    private static final Student FRANK = new Student(28, "Frank");
    private static final Student PATRIK = new Student(27, "Patrik");
    private static final Student JEFF = new Student(27, "Jeff");


    public static void main(String[] args) {

        List<Student> students = List.of(FRANK, PATRIK, JEFF);
        Map<Teacher, List<Student>> teachers = new HashMap<>();
        teachers.put(HAI, students);

        Consumer<Student> consumer = student -> System.out.println(student);
        IntConsumer intConsumer = intValue -> System.out.println(intValue);
        LongConsumer longConsumer = longValue -> System.out.println(longValue);
        DoubleConsumer doubleConsumer = doubleValue -> System.out.println(doubleValue);

        BiConsumer<Teacher, List<Student>> biConsumer = (teacher, student) -> System.out.println(student + ": " + teacher);
        ObjIntConsumer<Student> objIntConsumer = (student, intValue) -> System.out.println(intValue + ": " + student);
        ObjLongConsumer<Student> objLongConsumer = (student, longValue) -> System.out.println(longValue + ": " + student);
        ObjDoubleConsumer<Student> objDoubleConsumer = (student, doubleValue) -> System.out.println(doubleValue + ": " + student);

        students.forEach(consumer);
        intConsumer.accept(10);
        longConsumer.accept(10);
        doubleConsumer.accept(4.5);

        teachers.forEach(biConsumer);
        objIntConsumer.accept(FRANK, 20);
        objLongConsumer.accept(FRANK, 30L);
        objDoubleConsumer.accept(FRANK, 3.5);
    }
}
