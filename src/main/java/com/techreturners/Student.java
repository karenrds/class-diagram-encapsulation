package com.techreturners;

public class Student {

    private GradeType gradeType;
    private String name;
    private int group;
    private String secretName;

    public Student() {
        this.secretName = "MySecretNickName";
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
        System.out.println("Downgrade: " + gradeType.downgrade());
    }

    public void getUpGrade() {
        System.out.println("Upgrade: " + gradeType.upgrade());
    }

}