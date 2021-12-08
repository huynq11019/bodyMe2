package inftrasutructure.domain;

import inftrasutructure.support.Gender;

import java.io.Serializable;
import java.util.UUID;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;

    private String username;

    private String name;

    private String password;

    private String enrollmentNo; // Numer Báo danh của sinh viên

    private Gender gender;

    private String phone;

    private String email;
    private String address;


    public Student(String username, String password, String enrollmentNo, Gender gender, String phone, String email) {
        this.id = UUID.randomUUID().toString();
        this.username = username;
        this.password = password;
        this.enrollmentNo = enrollmentNo;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
    }


    public void update(Student student) {
        this.password = student.password;
        this.enrollmentNo = student.enrollmentNo;
        this.gender = student.getGender();
        this.email = student.getEmail();
        this.phone = student.getPhone();
        this.address = student.getAddress();
    }


    public String getAddress() {
        return address;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEnrollmentNo() {
        return enrollmentNo;
    }

    public void setEnrollmentNo(String enrollmentNo) {
        this.enrollmentNo = enrollmentNo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
