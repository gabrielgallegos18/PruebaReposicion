package com.example.grademanager;

import java.util.ArrayList;
import java.util.List;

public class Grade {
    private String student;
    private String subject;
    private double grade;

    public Grade(String student, String subject, double grade) {
        this.student = student;
        this.subject = subject;
        this.grade = grade;
    }

    public String getStudent() {
        return student;
    }

    public String getSubject() {
        return subject;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "student='" + student + '\'' +
                ", subject='" + subject + '\'' +
                ", grade=" + grade +
                '}';
    }
}

class GradeManager {
    private List<Grade> grades;

    public GradeManager() {
        grades = new ArrayList<>();
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    public double calculateAverage(String student) {
        double sum = 0;
        int count = 0;

        for (Grade grade : grades) {
            if (grade.getStudent().equals(student)) {
                sum += grade.getGrade();
                count++;
            }
        }

        return (count > 0) ? sum / count : 0;
    }

    public List<Grade> listGrades(String student) {
        List<Grade> result = new ArrayList<>();

        for (Grade grade : grades) {
            if (grade.getStudent().equals(student)) {
                result.add(grade);
            }
        }

        return result;
    }
}


