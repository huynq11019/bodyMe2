package inftrasutructure.domain;

import java.io.Serializable;
import java.util.*;

public class Principal implements Serializable {

    private static final long serialVersionUID = 1L;
    private String id;
    private String fullName;
    private String userName = "admin";
    private String password;

    private List<Student> students = new ArrayList<>();

    private List<Teacher> teachers = new ArrayList<>();

    private List<Class> classes = new ArrayList<>();

    private List<Subject> subjects = new ArrayList<>();

    public Principal(String id, String fullName, String userName, String password, List<Student> students, List<Teacher> teachers, List<Class> classes, List<Subject> subjects) {
        this.id = id;
        this.fullName = fullName;
        this.userName = userName;
        this.password = password;
        this.students = students;
        this.teachers = teachers;
        this.classes = classes;
        this.subjects = subjects;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Principal(String fullName, String userName, String password) {
        this.id = UUID.randomUUID().toString();
        this.fullName = fullName;
        this.userName = userName;
        this.password = password;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Class> getClasses() {
        return classes;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
