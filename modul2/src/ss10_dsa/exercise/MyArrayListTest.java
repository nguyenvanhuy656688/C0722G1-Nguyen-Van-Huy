package ss10_dsa.exercise;

public class MyArrayListTest {
    public static class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public Student() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public static void main(String[] args) {
        Student a = new Student(1, "Huy");
        Student b = new Student(2, "Khánh");
        Student c = new Student(3, "Vân");
        Student d = new Student(4, "Đạt");
        Student e = new Student(5, "Trung");
        Student f = new Student(6, "Bảo");
        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        MyArrayList<Student> newMyArrayList = new MyArrayList<>();


        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(e);
        studentMyArrayList.add(f, 2);

        studentMyArrayList.size();

        for (int i = 0; i < studentMyArrayList.size(); i++) {
            Student student = (Student) studentMyArrayList.elements[i];
            System.out.println(student.getId());
            System.out.println(student.getName());
        }
        System.out.println(studentMyArrayList.size());
        System.out.println("---------------------------------------");
        System.out.println(studentMyArrayList.get(2).getName());
        System.out.println("----------------------------------------");
        System.out.println(studentMyArrayList.indexOf(c));
        System.out.println("----------------------------------------");
        System.out.println(studentMyArrayList.contains(f));
        System.out.println("-----------------------------------------");
        newMyArrayList = studentMyArrayList.clone();
        for (int i = 0; i < newMyArrayList.size(); i++) {
            System.out.println(newMyArrayList.get(i).getName());
        }
        System.out.println("--------------------------------");
        Student student = newMyArrayList.remove(0);
        System.out.println(student.getName());

    }
}
