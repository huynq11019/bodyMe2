package inftrasutructure.domain;

import inftrasutructure.support.Gender;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;

    private String username;

    private String name;

    private String password;

    private String enrollmentNo; // Numer Báo danh của sinh viên

    private String gender;

    private String phone;

    private String email;

    private String address;

    private String classId;

    private String teacherId;

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    private List<Subject> mySubject;

    public Student(String username, String enrollmentNo, String gender, String phone, String email, String teacherid, String classid) {
        this.id = UUID.randomUUID().toString();
        this.username = username;
        this.enrollmentNo = enrollmentNo;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.classId = classid;
        this.teacherId = teacherid;
    }


    public void update(String name, String email, String phone, String addressl, String teacherid, String classid) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = addressl;
        this.teacherId = teacherid;
        this.classId = classid;
    }

    public void enrichMark(List<Subject> subjects) {
        this.mySubject = subjects;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public List<Subject> getMySubject() {
        return mySubject;
    }

    public void setMySubject(List<Subject> mySubject) {
        this.mySubject = mySubject;
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

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", enrollmentNo='" + enrollmentNo + '\'' +
                ", gender=" + gender +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
