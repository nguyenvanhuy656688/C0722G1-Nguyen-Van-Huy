package ss16_file.exercise.mvc.model;

import mvc.model.Person;

public class Student extends Person {
    private String nameClass;
    //wrapper class
    private double score;

    public Student(String code, String name, Boolean gender,int dateBirth, String nameClass, double score) {
        super(code, name, gender,dateBirth);
        this.nameClass = nameClass;
        this.score = score;
    }

    public Student(String nameClass, double score) {
        this.nameClass = nameClass;
        this.score = score;
    }

    public Student() {
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "student{" +
                "nameClass='" + nameClass + '\'' +
                ", score=" + score +
                "} " + super.toString();
    }

}
