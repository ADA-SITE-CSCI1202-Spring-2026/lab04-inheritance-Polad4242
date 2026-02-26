public class Teacher extends Person {

    private String department;
    private String courses;

    public Teacher() {
        super();
    }

    public Teacher(String firstName, String lastName, String gender,
                   String department, String courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return super.toString() + ", Department: " + department + ", Courses: " + courses;
    }

    public boolean equals(Teacher t) {
        if (t == null) return false;
        return getFirstName().equals(t.getFirstName()) &&
               getLastName().equals(t.getLastName()) &&
               getGender().equals(t.getGender()) &&
               department.equals(t.department) &&
               courses.equals(t.courses);
    }
}

class Student extends Person {

    private String studentId;

    public Student() {
        super();
    }

    public Student(String firstName, String lastName, String gender,
                   String studentId) {
        super(firstName, lastName, gender);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return super.toString() + ", Student ID: " + studentId;
    }

    public boolean equals(Student s) {
        if (s == null) return false;
        return getFirstName().equals(s.getFirstName()) &&
               getLastName().equals(s.getLastName()) &&
               getGender().equals(s.getGender()) &&
               studentId.equals(s.studentId);
    }
}