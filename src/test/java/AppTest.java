import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
      goTo("http://localhost:4567/");
      assertThat(pageSource()).contains("Triangle finder");
  }

  @Test
  public void isEquillateral() {
    goTo("http://localhost:4567/");
    fill("#side1").with("5");
    fill("#side2").with("5");
    fill("#side3").with("5");
    submit(".btn");
    assertThat(pageSource()).contains("Your Triangle is");
  }

  @Test
  public void isScalene() {
    goTo("http://localhost:4567/");
    fill("#side1").with("3");
    fill("#side2").with("4");
    fill("#side3").with("5");
    submit(".btn");
    assertThat(pageSource()).contains("Your Triangle is a Scalene Triangle!");
  }
  //
  // @Test
  // public void squareTestIsNotASquare() {
  //   goTo("http://localhost:4567/");
  //   fill("#length").with("7");
  //   fill("#width").with("5");
  //   submit(".btn");
  //   assertThat(pageSource()).contains("Your rectangle isn't a square!");
  // }
}
