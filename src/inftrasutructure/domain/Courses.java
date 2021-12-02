package inftrasutructure.domain;

import java.io.Serializable;

public class Courses implements Serializable {
    private static final long serialVersionUID = 1L;
    private String courseName;

    private String courseId;

    public Courses() {

    }

    public Courses(String courseName, String courseId) {
        this.courseName = courseName;
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }


    @Override
    public String toString() {
        return "Courses{" +
                "courseName='" + courseName + '\'' +
                ", courseId='" + courseId + '\'' +
                '}';
    }
}
