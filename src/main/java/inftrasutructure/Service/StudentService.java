package inftrasutructure.Service;

import inftrasutructure.repo.*;

public class StudentService {
    private final PrincipalDAO pricipalDAO;

    private final TeacherDAO teacherDAO;

    private final StudentDAO studentDAO;

    private final ClassDAO classDAO;

    private final SubjectDAO subjectDAO;



    public StudentService(PrincipalDAO pricipalDAO, TeacherDAO teacherDAO, StudentDAO studentDAO, ClassDAO classDAO, SubjectDAO subjectDAO) {
        this.pricipalDAO = pricipalDAO;
        this.teacherDAO = teacherDAO;
        this.studentDAO = studentDAO;
        this.classDAO = classDAO;
        this.subjectDAO = subjectDAO;
    }

    public void menu() {
        System.out.println("1. Add Student");
        System.out.println("2. Delete Student");
        System.out.println("3. Update Student");
        System.out.println("4. Find Student");
        System.out.println("5. List Student");
        System.out.println("6. Exit");
    }
}
