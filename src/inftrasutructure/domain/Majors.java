package inftrasutructure.domain;

public class Majors implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private String majorName;
    private String majorId;

    public Majors(String majorName, String majorId) {
        this.majorName = majorName;
        this.majorId = majorId;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getMajorId() {
        return majorId;
    }

    public void setMajorId(String majorId) {
        this.majorId = majorId;
    }

    @Override
    public String toString() {
        return "Majors{" +
                "majorName='" + majorName + '\'' +
                ", majorId='" + majorId + '\'' +
                '}';
    }
}
