package com.frank;

import java.util.List;

public class Course {

    private String title;
    private List<Student> students;

    public Course(String title, List<Student> students) {
        this.title = title;
        this.students = students;
    }

    public String getTitle() {
        return title;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", students=" + students +
                '}';
    }
}
