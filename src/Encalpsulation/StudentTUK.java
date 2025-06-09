package Encalpsulation;

public class StudentTUK {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRegno(int regno) {
        this.regno = regno;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private String email;
    private int regno;
    private String course;
    private int year;


    @Override
    public String toString() {
        return "StudentTUK{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", regno=" + regno +
                ", course='" + course + '\'' +
                ", year=" + year +
                '}';
    }

    public StudentTUK(String name, String email, int regno, String course, int year) {
        this.name = name;
        this.email = email;
        this.regno = regno;
        this.course = course;
        this.year =  year;

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getRegno() {
        return regno;
    }

    public String getCourse() {
        return course;
    }

    public int getYear() {
        return year;
    }

    public static void main (String[] args){
        StudentTUK student1 = new StudentTUK (   "John Doe",
                "johndooe32@gmail.com", 12345, "Computer Science", 2);
        StudentTUK student2 = new StudentTUK (   "Jane Smith",
                "Janesmith32@gmail.com", 12345, "Computer Science", 2);

        student1.toString();
        student2.toString();

        System.out.println(student1);
        System.out.println(student2);
    }
    }



