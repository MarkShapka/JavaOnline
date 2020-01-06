package Lesson_1.Task_2;

public class Triangle {
    double sideOne;
    double sideTwo;
    double sideThree;

    public Triangle() {
    }

    public Triangle(double sideOne, double sideTwo, double sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    public double getSideOne() {
        return sideOne;
    }

    public void setSideOne(double sideOne) {
        this.sideOne = sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(double sideTwo) {
        this.sideTwo = sideTwo;
    }

    public double getSideThree() {
        return sideThree;
    }

    public void setSideThree(double sideThree) {
        this.sideThree = sideThree;
    }

    public double area() {
        double halfOfPerimetr = (sideOne + sideTwo + sideThree) / 2;
        double area =Math.sqrt(halfOfPerimetr * (halfOfPerimetr - sideOne) * (halfOfPerimetr - sideTwo) * (halfOfPerimetr - sideThree));
        return area;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideOne=" + sideOne +
                ", sideTwo=" + sideTwo +
                ", sideThree=" + sideThree +
                '}';
    }
}
