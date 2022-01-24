package com.techreturners;

public class Student {

    private GradeType gradeType;
    private String name;
    private int group;
    private final String SECRETNAME = "MySecretNickName";

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public GradeType getGradeType() {
        return gradeType;
    }

    public void setGradeType(GradeType gradeType) {
        this.gradeType = gradeType;
    }

    public void displayName() {
        System.out.println("\nStudent Name: " + name);
    }

    public void displayGroup() {
        System.out.println("Group: " + group);
    }

    public void displayGrade() {
        System.out.println("Grade: " + gradeType);
    }

    public void getDownGrade() {
        GradeType downGradedType = gradeType.downgrade();
        if (downGradedType == this.gradeType) {
            System.out.println("Cannot downgrade as its the lowest - " + this.gradeType);
            return;
        }
        System.out.println("Downgrade: " + downGradedType);
    }

    public void getUpGrade() {
        GradeType updgradedType = gradeType.upgrade();
        if (updgradedType == this.gradeType) {
            System.out.println("Cannot upgrade as its the highest - " + this.gradeType);
            return;
        }
        System.out.println("Upgrade: " + updgradedType);
    }

}