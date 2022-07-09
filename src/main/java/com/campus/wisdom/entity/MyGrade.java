package com.campus.wisdom.entity;

/**
 * @ClassName MyGrade
 * @Description
 * @Author Abel
 * @Date 2022/7/6 10:04
 * @Version 1.0
 **/
public class MyGrade implements Comparable<MyGrade>{
    private Student student;
    private Course course;
    private int grade;
    private int makeupGrade;
    private int retakeMarks;
    private int finalGrade;

    public MyGrade() {
    }

    public MyGrade(Student student, Course course, int grade, int makeupGrade, int retakeMarks, int finalGrade) {
        this.student = student;
        this.course = course;
        this.grade = grade;
        this.makeupGrade = makeupGrade;
        this.retakeMarks = retakeMarks;
        this.finalGrade = finalGrade;
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

    public int getMakeupGrade() {
        return makeupGrade;
    }

    public void setMakeupGrade(int makeupGrade) {
        this.makeupGrade = makeupGrade;
    }

    public int getRetakeGrade() {
        return retakeMarks;
    }

    public void setRetakeGrade(int retakeMarks) {
        this.retakeMarks = retakeMarks;
    }

    public int getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(int finalGrade) {
        this.finalGrade = finalGrade;
    }

    @Override
    public String toString() {
        return "MyGrade{" +
                "student=" + student +
                ", course=" + course +
                ", grade=" + grade +
                ", makeupGrade=" + makeupGrade +
                ", retakeMarks=" + retakeMarks +
                ", finalGrade=" + finalGrade +
                '}';
    }

    @Override
    public int compareTo(MyGrade o) {
        return o.getCourse().getName().compareTo(this.getCourse().getName());
    }
}