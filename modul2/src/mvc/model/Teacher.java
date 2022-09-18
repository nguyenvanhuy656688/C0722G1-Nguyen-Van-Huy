package mvc.model;

public class Teacher extends Person {
    private String specialize;

    public Teacher(String code, String name, Boolean gender, int dateBirth, String specialize) {
        super(code, name, gender, dateBirth);
        this.specialize = specialize;
    }

    public Teacher() {
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "specialize='" + specialize + '\'' +
                '}';
    }
}
