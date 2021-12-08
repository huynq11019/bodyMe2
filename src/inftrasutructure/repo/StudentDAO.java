package inftrasutructure.repo;

import inftrasutructure.domain.Student;
import inftrasutructure.domain.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentDAO extends IDataSource<Student> {
    @Override
    public List<Student> saveAll(List<Student> data) {
        this.wireData(Student.class.getName(), data);
        return data;
    }

    @Override
    public List<Student> search(String filter) {
        List<Student> students = this.loadAll();
        // check students not empty
        if (students.isEmpty()) {
            System.err.println("No students found");
            return new ArrayList<>();
        }
        // check filter not empty
        if (filter.isEmpty()) {
            return students;
        }
        // filter students
        List<Student> filteredStudents = students.stream().filter(student -> student.getName().contains(filter))
                .collect(Collectors.toList());
        return filteredStudents;
    }
}
