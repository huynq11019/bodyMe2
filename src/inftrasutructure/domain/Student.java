package inftrasutructure.domain;

import java.io.Serializable;
import java.util.UUID;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private String studentID;

    private String name;
    private String address;
    private String classNumber;

    public Student(String name, String address, String classNumber) {
        this.studentID = UUID.randomUUID().toString();
        this.name = name;
        this.address = address;
        this.classNumber = classNumber;
    }

    public void update(String name, String address, String classNumber) {
        this.name = name;
        this.address = address;
        this.classNumber = classNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID='" + studentID + '\'' +
                ", address='" + address + '\'' +
                ", classNumber='" + classNumber + '\'' +
                '}';
    }
}
