package inftrasutructure.repo;

import inftrasutructure.domain.Principal;
import inftrasutructure.domain.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class TeacherDAO extends IDataSource<Teacher> {


    @Override
    public List<Teacher> saveAll(List<Teacher> data) {
//        this.wireData(Teacher.class.getName(), data);
        return data;
    }

    @Override
    public List<Teacher> search(String filter) {
        List<Teacher> teachers = this.loadAll();
        if (teachers.isEmpty()) {
            return new ArrayList<>();
        }
        // check if not type filter
        if (Objects.isNull(filter) || filter.isEmpty()) {
            return teachers;
        }
        // filter by name
        return teachers.stream().filter(teacher -> teacher.getFullName().contains(filter))
                .collect(Collectors.toList());
    }

    public Teacher findTeacherById(String id) {
        List<Teacher> teachers = this.loadAll();
        if (teachers.isEmpty()) {
            return null;
        }
        return teachers.stream().filter(teacher -> teacher.getId().equals(id)).findFirst().orElse(null);
    }
}
