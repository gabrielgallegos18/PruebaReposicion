package com.example.grademanager;

public class Main {
    public static void main(String[] args) {
        GradeManager manager = new GradeManager();

        manager.addGrade(new Grade("Alice", "Math", 90));
        manager.addGrade(new Grade("Alice", "Science", 85));
        manager.addGrade(new Grade("Bob", "Math", 70));
        manager.addGrade(new Grade("Alice", "History", 95));

        System.out.println("Average grade for Alice: " + manager.calculateAverage("Alice"));

        System.out.println("Grades for Alice:");
        for (Grade grade : manager.listGrades("Alice")) {
            System.out.println(grade);
        }
    }
}
