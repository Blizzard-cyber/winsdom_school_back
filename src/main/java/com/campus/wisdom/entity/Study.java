package com.campus.wisdom.entity;

/**
 * @ClassName Study
 * @Description
 * @Author Abel
 * @Date 2022/7/3 19:32
 * @Version 1.0
 **/
public class Study implements Comparable<Study>{
    private Student student;
    private Course course;
    private int grade;
    private static String creditSum;
    private String state;

    public Study() {
    }

    public Study(Student student, Course course, int grade, String state) {
        this.student = student;
        this.course = course;
        this.grade = grade;
        this.state = state;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public static String getCreditSum() {
        return creditSum;
    }

    public static void setCreditSum(String creditSum) {
        Study.creditSum = creditSum;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Study{" +
                "student=" + student +
                ", course=" + course +
                ", grade=" + grade +
                ", creditSum=" + creditSum +
                ", state='" + state + '\'' +
                '}';
    }

    @Override
    public int compareTo(Study o) {
        return o.getCourse().getName().compareTo(this.getCourse().getName());
    }
}