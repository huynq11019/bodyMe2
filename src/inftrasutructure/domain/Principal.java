package inftrasutructure.domain;

import java.io.Serializable;
import java.util.*;

public class Principal implements Serializable {

    private static final long serialVersionUID = 1L;
    private String id;
    private String fullName;
    private String userName = "admin";
    private String password;

    private List<Teacher> teachers;
    private List<Student> students;

    public void addTeacher(Teacher teacher) {
        if (Objects.isNull(teachers)) {
            teachers = new ArrayList<>();
        }
        teachers.add(teacher);
    }

    public List<Teacher> seeTeachersDetail() {
        if (Objects.isNull(teachers)) {
            teachers = new ArrayList<>();
        }
        return teachers;
    }

    public List<Teacher> teacherOf() {

        return teachers;
    }

    /// students

    public void addStudent(Student student) {
        if (Objects.isNull(students)) {
            students = new ArrayList<>();
        }
        students.add(student);
    }

    public void modifyStudent(UUID studentId, Student student) {
        if (Objects.nonNull(students)) {
            this.students.stream().filter(s -> s.getId().equals(studentId))
                    .findFirst().ifPresent(s -> {
                        s.update(student);
                    });
        }
    }


    public String login() {
        return "";
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
