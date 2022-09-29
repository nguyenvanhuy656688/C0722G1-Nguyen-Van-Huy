package ss16_file.exercise.mvc.model;

public abstract class Person {
    private String code;
    private String name;
    private Boolean gender;
    private int dateBirth;

    public Person(String code, String name, Boolean gender ,int dateBirth) {
        this.code = code;
        this.name = name;
        this.gender = gender;
        this.dateBirth = dateBirth;
    }

    public Person() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public int getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(int dateBirth) {
        this.dateBirth = dateBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +"\'"+
                ",date of birth"+ dateBirth+
                '}';
    }
}
