package com.techreturners;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Jack");
        student1.setGroup(Group.group1.getGroupNumber());
        student1.setGradeType(GradeType.B);
        student1.displayName();
        student1.displayGroup();
        student1.displayGrade();
        student1.getDownGrade();

        Student student2 = new Student();
        student2.setName("Jill");
        student2.setGroup(Group.group2.getGroupNumber());
        student2.setGradeType(GradeType.A);
        student2.displayName();
        student2.displayGroup();
        student2.displayGrade();
        student2.getUpGrade();
    }
}
