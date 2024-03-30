package basic.class_03;

public class Rectangle {
    int width;
    int height;

     int calculateArea(int width, int height) {
        return width * height;
    }

    int calculatePerimeter(int width, int height) {
        return 2 * (width + height);
    }

  boolean isSquare(int width, int height) {
        return width == height;
    }
}
