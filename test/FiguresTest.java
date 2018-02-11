import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

public class FiguresTest {

  @Test
  public void generateSquare1x1WithParameter() {
    StringBuilder square = new StringBuilder();
    square.append("*").append(System.getProperty("line.separator"));
    assertThat(GenerateFigures.generateSquare(1), is(square.toString()));
  }

  @Test
  public void generateSquare3x3ByDefault() {
    StringBuilder square = new StringBuilder();
    square.append("***").append(System.getProperty("line.separator"));
    square.append("***").append(System.getProperty("line.separator"));
    square.append("***").append(System.getProperty("line.separator"));
    assertThat(GenerateFigures.generateSquare(), is(square.toString()));
  }

  @Test
  public void generateSquare6x6WithParameter() {
    StringBuilder square = new StringBuilder();
    square.append("******").append(System.getProperty("line.separator"));
    square.append("******").append(System.getProperty("line.separator"));
    square.append("******").append(System.getProperty("line.separator"));
    square.append("******").append(System.getProperty("line.separator"));
    square.append("******").append(System.getProperty("line.separator"));
    square.append("******").append(System.getProperty("line.separator"));
    assertThat(GenerateFigures.generateSquare(6), is(square.toString()));
  }

  @Test
  public void generateTriangle1x1WithParameter() {
    StringBuilder triangle = new StringBuilder();
    triangle.append("*").append(System.getProperty("line.separator"));
    assertThat(GenerateFigures.generateTriangle(1), is(triangle.toString()));
  }

  @Test
  public void generateTriangle5x3ByDefault() {
    StringBuilder triangle = new StringBuilder();
    triangle.append("  *  ").append(System.getProperty("line.separator"));
    triangle.append(" *** ").append(System.getProperty("line.separator"));
    triangle.append("*****").append(System.getProperty("line.separator"));
    assertThat(GenerateFigures.generateTriangle(), is(triangle.toString()));
  }

  @Test
  public void generateTriangle9x5WithParameter() {
    StringBuilder triangle = new StringBuilder();
    triangle.append("    *    ").append(System.getProperty("line.separator"));
    triangle.append("   ***   ").append(System.getProperty("line.separator"));
    triangle.append("  *****  ").append(System.getProperty("line.separator"));
    triangle.append(" ******* ").append(System.getProperty("line.separator"));
    triangle.append("*********").append(System.getProperty("line.separator"));
    assertThat(GenerateFigures.generateTriangle(5), is(triangle.toString()));
  }

  @Test
  public void drawLevelThree() {
    StringBuilder triangleResult = GenerateFigures.drawLevel(5, 2);
    StringBuilder triangle = new StringBuilder();
    triangle.append("*****").append(System.getProperty("line.separator"));
    assertThat(triangleResult.toString(), is(triangle.toString()));
  }

  @Test
  public void drawLevelFour() {
    StringBuilder triangleResult = GenerateFigures.drawLevel(9, 3);
    StringBuilder triangle = new StringBuilder();
    triangle.append(" ******* ").append(System.getProperty("line.separator"));
    assertThat(triangleResult.toString(), is(triangle.toString()));
  }

  @Test
  public void generateDiamond1x1WithParameter() {
    StringBuilder diamond = new StringBuilder();
    diamond.append("*").append(System.getProperty("line.separator"));
    assertThat(GenerateFigures.generateDiamond(1), is(diamond.toString()));
  }

  @Test
  public void generateDiamondDiagonal3ByDefault() {
    StringBuilder diamond = new StringBuilder();
    diamond.append("  *  ").append(System.getProperty("line.separator"));
    diamond.append(" *** ").append(System.getProperty("line.separator"));
    diamond.append("*****").append(System.getProperty("line.separator"));
    diamond.append(" *** ").append(System.getProperty("line.separator"));
    diamond.append("  *  ").append(System.getProperty("line.separator"));
    assertThat(GenerateFigures.generateDiamond(), is(diamond.toString()));
  }

  @Test
  public void generateDiamondDiagonal5WithEmptyParameter() {
    StringBuilder diamond = new StringBuilder();
    diamond.append("    *    ").append(System.getProperty("line.separator"));
    diamond.append("   ***   ").append(System.getProperty("line.separator"));
    diamond.append("  *****  ").append(System.getProperty("line.separator"));
    diamond.append(" ******* ").append(System.getProperty("line.separator"));
    diamond.append("*********").append(System.getProperty("line.separator"));
    diamond.append(" ******* ").append(System.getProperty("line.separator"));
    diamond.append("  *****  ").append(System.getProperty("line.separator"));
    diamond.append("   ***   ").append(System.getProperty("line.separator"));
    diamond.append("    *    ").append(System.getProperty("line.separator"));
    assertThat(GenerateFigures.generateDiamond(5), is(diamond.toString()));
  }
}
