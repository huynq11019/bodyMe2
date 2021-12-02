package inftrasutructure.domain;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public class Teacher implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String teacherId;
    private String address;

    public Teacher(String name, String address) {
        this.teacherId = UUID.randomUUID().toString();

        this.name = name;
        this.address = address;
    }

    public void updateTeacher(String name, String address) {
        this.name = name;
        this.address = address;
    }

    private List<HomeRoom> homeRoom;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", teacherId='" + teacherId + '\'' +
                ", address='" + address + '\'' +
                ", homeRoom=" + homeRoom +
                '}';
    }
}
