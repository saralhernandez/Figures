public final class GenerateFigures {

  public static String generateSquare() {
    return drawSquare(3);
  }

  public static String generateSquare(int area) {
    return drawSquare(area);
  }

  public static String generateTriangle() {
    return drawTriangle(3);
  }

  public static String generateTriangle(int height) {
    return drawTriangle(height);
  }

  public static String generateDiamond() {
    return drawDiamond(3);
  }

  public static String generateDiamond(int height) {
    return drawDiamond(height);
  }

  public static String drawSquare(int areaSquare) {
    StringBuilder square = new StringBuilder();

    for (int line = 0; line < areaSquare; line++) {
      square.append(drawLevel(areaSquare, areaSquare));
    }

    return square.toString();
  }

  public static String drawTriangle(int height) {
    StringBuilder triangle = new StringBuilder();
    int baseTriangle = (height * 2) - 1;

    for (int heightTriangle = 0; heightTriangle < height; heightTriangle++) {
      triangle.append(drawLevel(baseTriangle, heightTriangle));
    }

    return triangle.toString();
  }

  private static String drawDiamond(int height) {
    StringBuilder diamond = new StringBuilder();
    int baseTriangle = (height * 2) - 1;

    for (int heightTriangle = 0; heightTriangle < height; heightTriangle++) {
      diamond.append(drawLevel(baseTriangle, heightTriangle));
    }

    for (int heightTriangle = height - 2; heightTriangle >= 0; heightTriangle--) {
      diamond.append(drawLevel(baseTriangle, heightTriangle));
    }

    return diamond.toString();
  }

  public static StringBuilder drawLevel(int baseFigure, int height) {
    StringBuilder level = new StringBuilder();
    int middlePoint = baseFigure / 2;
    int leftPoint = middlePoint - height;
    int rightPoint = middlePoint + height;
    for (int base = 0; base < baseFigure; base++) {
      if (base >= leftPoint && base <= rightPoint) {
        level.append("*");
      } else {
        level.append(" ");
      }
    }

    level.append(System.getProperty("line.separator"));
    return level;
  }
}