package inftrasutructure.domain;

import java.io.Serializable;

public class Score implements Serializable {
    private String studentId;
    private String courseId;
    private String classId;

    public Score(String studentId, String courseId, String classId) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.classId = classId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "Score{" +
                "studentId='" + studentId + '\'' +
                ", courseId='" + courseId + '\'' +
                ", classId='" + classId + '\'' +
                '}';
    }
}
