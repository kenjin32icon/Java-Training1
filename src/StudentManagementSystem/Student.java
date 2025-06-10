package StudentManagementSystem;

import java.util.ArrayList;
import java.util.List;
public class Student {
    private String name;
    private String IDno;
    private String Course;
    private char Grade;

    public Student() {
    }

    //access methods the getter and mutator methods the setters
    //Getters:- Provide a safeguard way to get the value of each instance from the outside of the Student Class
    //Setters:- Provide a scripte way to change th value of the private field variables of this class
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIDno() {
        return IDno;
    }

    public void setIDno(String IDno) {
        this.IDno = IDno;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public char getGrade() {
        return Grade;
    }

    public void setGrade(char grade) {
        Grade = grade;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", IDno=" + IDno + '\'' +
                ", Course='" + Course + '\'' +
                ", Grade=" + Grade +
                '}';
    }


    //Class private field constructors
    public Student(String name, String IDno, String Course, char Grade){
        this.name = name;
        this.IDno = IDno;
        this.Course = Course;
        this.Grade = Grade;
    }
}
