package inftrasutructure.domain;

import java.io.Serializable;

public class Class implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String classId;
    private String majorId;
    private String teacherId;
    private String trainingId;
    private String quantity;

    public Class() {
    }

    public Class(String name, String classId, String majorId, String teacherId, String trainingId, String quantity) {
        this.name = name;
        this.classId = classId;
        this.majorId = majorId;
        this.teacherId = teacherId;
        this.trainingId = trainingId;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Class{" +
                "name='" + name + '\'' +
                ", classId='" + classId + '\'' +
                ", majorId='" + majorId + '\'' +
                ", teacherId='" + teacherId + '\'' +
                ", trainingId='" + trainingId + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getMajorId() {
        return majorId;
    }

    public void setMajorId(String majorId) {
        this.majorId = majorId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(String trainingId) {
        this.trainingId = trainingId;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
