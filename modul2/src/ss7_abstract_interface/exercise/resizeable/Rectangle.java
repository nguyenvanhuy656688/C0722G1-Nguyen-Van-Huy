package ss7_abstract_interface.comparator.exercise.resizeable;

import ss6_inhertance.practice.Shape;

public class Rectangle implements Resizeable {
        private double width ;
        private double length ;

        public Rectangle() {
        }

        public Rectangle(double width, double length) {
            this.width = width;
            this.length = length;
        }

        public Rectangle(double width, double length, String color, boolean filled) {
            this.width = width;
            this.length = length;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getArea() {
            return width * this.length;
        }

        public double getPerimeter() {
            return 2 * (width + this.length);
        }


        @Override
        public String toString() {
            return "A Rectangle with width="
                    + getWidth()
                    + " and length="
                    + getLength();
        }

    @Override
    public void resize(double percent) {
        this.width = this.width +(this.width*percent/100);
        this.length = this.length +(this.length*percent/100);
    }
}

