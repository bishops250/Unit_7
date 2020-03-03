

public class Rectangle {

    private  double rectangleLength;
    private  double rectangleWidth;

  public Rectangle(double rectangleLength, double rectangleWidth) {
      this.rectangleLength =rectangleLength;
      this.rectangleWidth = rectangleWidth;
  }


    public double getRectangleLength() {
        return rectangleLength;
    }

    public double getRectangleWidth() {
        return rectangleWidth;
    }

    public double getRectangleArea() {
      return (rectangleLength * rectangleWidth);
    }

}
