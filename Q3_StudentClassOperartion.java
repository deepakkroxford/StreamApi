import java.util.ArrayList;
import java.util.List;

class Student {
    private int id;
    private String name;
    private int age;
    private double marks;
    private String grade;
    private String city;
    private boolean passed;

    public Student(int id, String name, int age, double marks, String grade, String city, boolean passed) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.grade = grade;
        this.city = city;
        this.passed = passed;
    }

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

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", marks=" + marks +
                ", grade='" + grade + '\'' +
                ", city='" + city + '\'' +
                ", passed=" + passed +
                '}';
    }

}

public class Q3_StudentClassOperartion {
    public static void main(String[] args) {
        List<Student> stu = new ArrayList<>();
        stu.add(new Student(1, "John", 20, 85.5, "A", "New York", true));
        stu.add(new Student(2, "Alice", 21, 90.0, "A+", "Los Angeles", true));
        stu.add(new Student(3, "Bob", 19, 75.0, "B", "Chicago", true));
        stu.add(new Student(4, "Emily", 22, 65.0, "C", "Houston", true));
        stu.add(new Student(5, "David", 20, 55.0, "D", "Phoenix", false));
        stu.add(new Student(6, "Sarah", 21, 95.0, "A+", "Philadelphia", true));
        stu.add(new Student(7, "Michael", 19, 80.0, "B+", "San Antonio", true));
        stu.add(new Student(8, "Emma", 20, 70.0, "B-", "San Diego", true));
        stu.add(new Student(9, "James", 22, 50.0, "F", "Dallas", false));
        stu.add(new Student(10, "Olivia", 21, 88.0, "A-", "San Jose", true));

        
        System.out.println();

        /*
         * finding the student name whose marks is greater than 80.
         */
        List<Student> gradeA = stu.stream().filter(student -> student.getMarks() > 80).toList();
        long ageCount = stu.stream().filter(student -> student.getAge() > 20).count();
        System.out.println("age count greater than 20: " +ageCount);
        System.out.println();
        System.out.println();
        System.out.println(gradeA);

    }
}
