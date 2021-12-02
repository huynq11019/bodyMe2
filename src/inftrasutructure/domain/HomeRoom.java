package inftrasutructure.domain;

import java.io.Serializable;

public class HomeRoom implements Serializable {
    private static final long serialVersionUID = 1L;

    private String teacherName;
    private String address;
    private String teacherId;

    public HomeRoom(String teacherName, String address, String teacherId) {
        this.teacherName = teacherName;
        this.address = address;
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "HomeRoom{" +
                "teacherName='" + teacherName + '\'' +
                ", address='" + address + '\'' +
                ", teacherId='" + teacherId + '\'' +
                '}';
    }
}
