package inftrasutructure.domain;

import java.io.Serializable;

public class SubjectTeacher implements Serializable {
    private static final long serialVersionUID = 1L;
    private String subject;
    private String teacher;

    public SubjectTeacher(String subject, String teacher) {
        this.subject = subject;
        this.teacher = teacher;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
