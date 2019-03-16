package Question3.WrongWay;

//Wrong way, what if a new shape comes along

public class OpenClosed {

    public class Rectangle{
        public double length;
        public double width;
    }

    public class Circle{
        public double radius;
    }

    public class AreaCalculator{
        public double calculateRectangleArea(Rectangle rectangle){
            return rectangle.width*rectangle.length;
        }

        public double calculateCircleArea(Circle circle){
            return Math.PI*circle.radius*circle.radius;
        }
    }
}
