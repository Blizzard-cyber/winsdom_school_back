package com.campus.wisdom.entity;

/**
 * @ClassName TimeTable
 * @Description
 * @Author Abel
 * @Date 2022/7/1 15:00
 * @Version 1.0
 **/
public class CourseTable {
    private Student student;
    private Teacher teacher;
    private Course course;
    private CourseTime courseTime;
    private Textbook textbook;
    private String semester;

    public CourseTable() {
    }

    public CourseTable(Student student, Teacher teacher, Course course, CourseTime courseTime, Textbook textbook, String semester) {
        this.student = student;
        this.teacher = teacher;
        this.course = course;
        this.courseTime = courseTime;
        this.textbook = textbook;
        this.semester = semester;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public CourseTime getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(CourseTime courseTime) {
        this.courseTime = courseTime;
    }

    public Textbook getTextbook() {
        return textbook;
    }

    public void setTextbook(Textbook textbook) {
        this.textbook = textbook;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "CourseTable{" +
                "student=" + student +
                ", teacher=" + teacher +
                ", course=" + course +
                ", courseTime=" + courseTime +
                ", textbook=" + textbook +
                ", semester='" + semester + '\'' +
                '}';
    }
}
