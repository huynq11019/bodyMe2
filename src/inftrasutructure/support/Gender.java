package inftrasutructure.support;

public enum Gender {
    MALE(1, "Nam", "BOY"),
    FEMALE(0, "Nữ", "GIRL");
    Integer code;
    String vi;
    String en;
    Gender(Integer code, String vi, String en){
        this.code = code;
        this.vi = vi;
        this.en = en;
    }

    public Integer getCode() {
        return code;
    }

    public String getVi() {
        return vi;
    }
}
