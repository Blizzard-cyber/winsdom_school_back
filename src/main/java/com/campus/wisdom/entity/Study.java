package com.campus.wisdom.entity;

/**
 * @ClassName Study
 * @Description
 * @Author Abel
 * @Date 2022/7/3 19:32
 * @Version 1.0
 **/
public class Study {
    private Student student;
    private Course course;
    private int grade;
    private int makeupGrade;
    private int retakeGrade;
    private static String creditSum;
    private String state;

    public Study() {
    }

    public Study(Student student, Course course, int grade, int makeupGrade, int retakeGrade, String creditSum, String state) {
        this.student = student;
        this.course = course;
        this.grade = grade;
        this.makeupGrade = makeupGrade;
        this.retakeGrade = retakeGrade;
        Study.creditSum = creditSum;
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

    public int getMakeupGrade() {
        return makeupGrade;
    }

    public void setMakeupGrade(int makeupGrade) {
        this.makeupGrade = makeupGrade;
    }

    public int getRetakeGrade() {
        return retakeGrade;
    }

    public void setRetakeGrade(int retakeGrade) {
        this.retakeGrade = retakeGrade;
    }

    public String getCreditSum() {
        return creditSum;
    }

    public void setCreditSum(String creditSum) {
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
                ", makeupGrade=" + makeupGrade +
                ", retakeGrade=" + retakeGrade +
                ", creditSum='" + creditSum + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}