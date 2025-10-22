package BuilderPattern;
public class Pepsi extends ColdDrink {
  @Override
  public float price() {
      return isDiet ? 37.0f : 35.0f;
  }
  @Override
  protected String getBaseName() {
      return "Pepsi";
  }
}