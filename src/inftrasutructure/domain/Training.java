package inftrasutructure.domain;

import java.io.Serializable;

public class Training implements Serializable {
    private static final long serialVersionUID = 1L;

    private String  name;
    private String trainingId;

    public Training(String name, String trainingId) {
        this.name = name;
        this.trainingId = trainingId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(String trainingId) {
        this.trainingId = trainingId;
    }
}
