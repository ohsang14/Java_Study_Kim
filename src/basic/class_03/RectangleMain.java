package basic.class_03;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 8;

        int area = rectangle.calculateArea(rectangle.width, rectangle.height);
        System.out.println("넓이: " + area);
        int perimeter = rectangle.calculatePerimeter(rectangle.width, rectangle.height);
        System.out.println("둘레 길이: " + perimeter);
        boolean square = rectangle.isSquare(rectangle.width, rectangle.height);
        System.out.println("정사각형 여부: " + square);
    }
}
