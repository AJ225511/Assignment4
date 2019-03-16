package Question3.RightWay;

//Right way, can tackle any shape
public class OpenClosed {

    public interface Shape{
        public double calculateArea();
    }

    public class Rectangle implements Shape{
        double length;
        double width;
        public double calculateArea(){
            return length * width;
        }
    }

    public class Circle implements Shape{
        public double radius;
        public double calculateArea(){
            return Math.PI*radius*radius;
        }
    }

    public class AreaCalculator{
        public double calculateShapeArea(Shape shape){
            return shape.calculateArea();
        }
    }
}
