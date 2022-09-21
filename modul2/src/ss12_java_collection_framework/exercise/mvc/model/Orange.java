package ss12_java_collection_framework.exercise.mvc.model;

public class Orange extends Fruit {
    private Integer number;
    private String color ;
    private String taste ;

    public Orange(Integer number,String color, String taste) {
        this.number =number;
        this.color = color;
        this.taste = taste;
    }

    public Orange(Integer number,String mass, String price, String source, String color, String taste) {
        super(mass, price, source);
        this.number = number;
        this.color = color;
        this.taste = taste;
    }
    public Orange(){

    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "color='" + color + '\'' +
                ", taste='" + taste + '\'' +
                super.toString()+
                '}';
    }
}
