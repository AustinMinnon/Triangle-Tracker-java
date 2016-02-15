
import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {

  @Test
  public void newTriangle_instantiatesCorrectly() {
    Triangle testTriangle = new Triangle(2, 2, 2);
    assertEquals(true, testTriangle instanceof Triangle);
  }

  @Test
public void newTriangle_setSideOne() {
  Triangle testTriangle = new Triangle(2, 2, 2);
  assertEquals(2, 2, testTriangle.getSideOne());
  }

  @Test
public void newTriangle_setSideTwo() {
  Triangle testTriangle = new Triangle(2, 2, 2);
  assertEquals(2, 2, testTriangle.getSideTwo());
}

@Test
public void newTriangle_setSideThree() {
Triangle testTriangle = new Triangle(2, 2, 2);
assertEquals(2, 2, testTriangle.getSideThree());
}

@Test
public void isEquillateral_whenAllSidesEqual_true() {
  Triangle testTriangle = new Triangle(2, 2, 2);
  assertEquals(true, testTriangle.isEquillateral());
}
@Test
public void isIsosceles_whenAllTwoSidesEQL_true() {
  Triangle testTriangle = new Triangle(2, 2, 3);
  assertEquals(true, testTriangle.isIsosceles());
}
@Test
public void isScalene_whenNoSidesEQL_true() {
  Triangle testTriangle = new Triangle(3, 4, 5);
  assertEquals(true, testTriangle.isScalene());
  }
  // @Test
  // public void isNotTriangle_whenSumOfTwoSidesIsLessThanThird_true() {
  //   Triangle testTriangle = new Triangle(1, 1, 3 );
  //   assertEquals(true, testTriangle.isNotTriangle());
  //   }
  @Test
  public void isTriangle_whenSumOfTwoSidesIsgreaterThanThird_true() {
    Triangle testTriangle = new Triangle(3, 3, 3);
    assertEquals(true, testTriangle.isTriangle());
    }

}
