import java.io.Serializable;

public class Q1 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(101);
        student.setName("Alice");
        student.setAge(20);
        student.setGrade("A");

        System.out.println("Student Info:");
        System.out.println(student);

        // Or using parameterized constructor
        Student s2 = new Student(102, "Bob", 21, "B");
        System.out.println(s2);
    }
}

class Student implements Serializable {
    private int id;
    private String name;
    private int age;
    private String grade;

    // No-arg constructor (required for a bean)
    public Student() {
    }

    // Parameterized constructor (optional, for convenience)
    public Student(int id, String name, int age, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getter and setter methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    // Optional: toString() for easy display
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + '\'' +
               ", age=" + age + ", grade='" + grade + "'}";
    }
}