package inftrasutructure.repo;

import inftrasutructure.domain.Class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ClassDAO extends IDataSource<Class> {
    @Override
    public List<Class> saveAll(List<Class> data) {
        return null;
    }

    @Override
    public List<Class> search(String filter) {
        List<Class> classes = this.loadAll();
        if (Objects.isNull(classes) || classes.isEmpty()) {
            classes = new ArrayList<>();
            classes.add(new Class("UDPM"));
            classes.add(new Class("DTVT"));
            classes.add(new Class("DESIGN"));
            classes.add(new Class("DIGITAL MARKETING"));

        }
        return classes;
    }
}
