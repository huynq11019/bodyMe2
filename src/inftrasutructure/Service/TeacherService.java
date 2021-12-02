package inftrasutructure.Service;

import inftrasutructure.domain.Teacher;
import inftrasutructure.repo.TeacherDAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TeacherService {
    private final TeacherDAO teacherDAO = new TeacherDAO();

    public TeacherService() {
    }

    public String addTeacher(String name, String address){
        Teacher teacher = new Teacher(name, address);
        this.teacherDAO.save(teacher.getTeacherId(),teacher);
        System.out.println("Add Teacher Success");
        System.out.println(this.teacherDAO.findById(teacher.getTeacherId()));
        return "oke";
    }

    public int deleteTeacher(String teacherId){
        // check object is exist
        Teacher teacher = this.teacherDAO.findById(teacherId);
        if (Objects.isNull(teacher)){
            System.err.println("Teacher not found");
            return 0;
        }
        this.teacherDAO.delete(teacherId);
        return 1;
    }

    public int updateTeacher(String teacherId, String name, String address){
        Teacher teacher = this.teacherDAO.findById(teacherId);
        if (Objects.isNull(teacher)){
            System.err.println("Teacher not found");
            return 0;
        }
        teacher.updateTeacher(name, address);
        this.teacherDAO.save(teacher.getTeacherId(), teacher);
        return 1;
    }

    public Teacher findTeacher(String teacherId){

        Teacher teacher = this.teacherDAO.findById(teacherId);
        if (Objects.isNull(teacher)){
            System.err.println("Teacher not found");
            return null;
        }
        return teacher;
    }

    public List<Teacher> searchTeacher(String keyword){
        List<Teacher> teacher = this.teacherDAO.search(keyword);
        if (teacher.isEmpty()){
            System.err.println("Teacher not found");
            return new ArrayList<>();
        }
        return teacher;
    }
    public void menu (){
        System.out.println("1. Add Teacher");
        System.out.println("2. Delete Teacher");
        System.out.println("3. Update Teacher");
        System.out.println("4. Find Teacher");
        System.out.println("5. search Teacher");
        System.out.println("6. Exit");
    }

}
