public class Student implements Comparable<Student> {
    private String studentNumber;
    private String name;
    private int age;
    

    public Student(String name, int age, String studentNumber) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }

     public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }


    public String getStudentNumber() {
        return this.studentNumber;
    }



    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public int compareTo(Student student) {
        return this.studentNumber.compareTo(student.getStudentNumber());

    }



    @Override
    public String toString() {
        return "N:" + this.name + " A:" + age + " SN:" + studentNumber;
    }
}

