package inftrasutructure.domain;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public class Teacher implements Serializable {
    private static final long serialVersionUID = 1L;
    private UUID id;

    private String userName;
    private String passsword;

    private String fullName ;
    private Integer age;
    private String address;
    private String phoneNo;
    private String email;

    public Teacher(String userName, String passsword, String fullName, Integer age, String address, String phoneNo, String email) {
        this.id = UUID.randomUUID();
        this.userName = userName;
        this.passsword = passsword;
        this.fullName = fullName;
        this.age = age;
        this.address = address;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    public void update(String fullName, Integer age, String address, String phoneNo, String email) {
        this.fullName = fullName;
        this.age = age;
        this.address = address;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passsword='" + passsword + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public UUID getId() {
        return id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
