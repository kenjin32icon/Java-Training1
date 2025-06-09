package StudentManagementSystem;

public class Student {
    private String name;
    private int IDno;
    private String Course;
    private char Grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIDno() {
        return IDno;
    }

    public void setIDno(int IDno) {
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
                ", IDno=" + IDno +
                ", Course='" + Course + '\'' +
                ", Grade=" + Grade +
                '}';
    }


    public Student(String name, int IDno, String Course, char Grade){
        this.name = name;
        this.IDno = IDno;
        this.Course = Course;
        this.Grade = Grade;
    }
}
