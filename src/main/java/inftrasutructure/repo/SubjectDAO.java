package inftrasutructure.repo;

import inftrasutructure.domain.Subject;

import java.util.ArrayList;
import java.util.List;

public class SubjectDAO extends IDataSource<Subject> {
    @Override
    public List<Subject> saveAll(List<Subject> data) {
        return null;
    }

    @Override
    public List<Subject> search(String filter) {
        List<Subject> list = new ArrayList<>();
        list.add(new Subject("IOT"));
        list.add(new Subject("JAVA"));
        list.add(new Subject("DESIGN"));
        return list;
    }
}
