package inftrasutructure.domain;

import java.io.Serializable;

public class Staff implements Serializable {
    private  String staffId;
    private  String staffName;
    private  String email;
    private  String address;

    public Staff(String staffId, String staffName, String email, String address) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.email = email;
        this.address = address;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffId='" + staffId + '\'' +
                ", staffName='" + staffName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
