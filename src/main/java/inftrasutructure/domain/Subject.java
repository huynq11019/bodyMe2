package inftrasutructure.domain;

import java.io.Serializable;
import java.util.UUID;

public class Subject implements Serializable {

    private static final long serialVersionUID = -3389363800876569458L;

    private UUID subjectId;
    private String subjectName;
    private int mark;

    public Subject( String subjectName) {

        this.subjectId = UUID.randomUUID();
        this.subjectName = subjectName;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public void updateName(String subjectName) {
        this.subjectName = subjectName;
    }

    public UUID getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(UUID subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectId=" + subjectId +
                ", subjectName='" + subjectName + '\'' +
                '}';
    }
}
