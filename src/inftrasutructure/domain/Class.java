package inftrasutructure.domain;

import java.io.Serializable;
import java.util.UUID;

public class Class implements Serializable {
    private static final long serialVersionUID = 1L;

    private UUID id;

    private String name;

    public Class( String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
