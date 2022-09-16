package ss10_dsa.exercise;

import java.util.Arrays;

public class MyArrayList<E> {
    public Object[] elements;
//    public TestMyArrayList.Student elements(int i) {
//        return this;
//    }

    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;


    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        if (capacity > 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity: " + capacity);
        }

    }

    public int size() {
        return this.size;
    }

    //phương thức clear arraylist
    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    //phương thức add 1 phần tử vào myarraylist
    public boolean add(E element) {
        if (elements.length == size) {
            this.ensuraCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

    public void add(E element, int index) {
        if (index > elements.length) {
            throw new IllegalArgumentException("index: " + index);
        } else if (elements.length == size) {
            this.ensuraCapacity(5);
        }
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }


    //phương thức tăng kích thước của MyArrayList
    public void ensuraCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity: " + minCapacity);
        }
    }

    //phương thức lấy 1 element tại vị trí index
    public E get(int index) {
        return (E) elements[index];
    }

    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return index;
    }

    //phương thức kiểm tra 1 phân tử có trong MyArrayList hay không
    public boolean contains(E element) {
        return this.indexOf(element) >= 0;
    }

    //phương thức tạo ra 1 bản sao của MyArrayList hiện tại
    public MyArrayList<E> clone() {
        MyArrayList v = new MyArrayList<>();
        v.elements = Arrays.copyOf(this.elements, this.size);
        v.size = this.size;
        return v;
    }

    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IllegalArgumentException("Error index:" + index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }


}