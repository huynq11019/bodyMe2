package inftrasutructure.repo;

import inftrasutructure.domain.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class TeacherDAO extends IDataSource<Teacher> {


    @Override
    public List<Teacher> saveAll(List<Teacher> data) {
        return null;
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
        // filter
        return teachers.stream().filter(teacher -> teacher.getName().contains(filter))
                .collect(Collectors.toList());
    }
}
