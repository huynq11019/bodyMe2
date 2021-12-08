package inftrasutructure.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Teacher implements Serializable {
    private static final long serialVersionUID = 1L;
    private UUID id;

    private String userName;
    private String passsword;

    private String fullName ;
    private Integer age;
    private String email;

    private List<Student> students = new ArrayList<>();

    private List<Class> classes = new ArrayList<>();

    private List<Subject> subjects = new ArrayList<>();

    public Teacher(String userName, String passsword, String fullName, Integer age, String email) {
        this.id = UUID.randomUUID();
        this.userName = userName;
        this.passsword = passsword;
        this.fullName = fullName;
        this.age = age;
        this.email = email;
    }

    public void update(String fullName, String email, Integer age) {
        this.fullName = fullName;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passsword='" + passsword + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    public String getId() {
        return id.toString();
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasssword() {
        return passsword;
    }

    public void setPasssword(String passsword) {
        this.passsword = passsword;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
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
}
