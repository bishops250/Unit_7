

public class Rectangle {

    private static double rectangleLength;
    private static double rectangleWidth;

  public Rectangle(double rectangleLength, double rectangleWidth) {
      Rectangle.rectangleLength =rectangleLength;
      Rectangle.rectangleWidth = rectangleWidth;
  }


    public static double getRectangleLength() {
        return rectangleLength;
    }

    public static double getRectangleWidth() {
        return rectangleWidth;
    }

    public static double getRectangleArea() {
      return (rectangleLength * rectangleWidth);
    }

}
