package BuilderPattern;

public class Coke extends ColdDrink {
  @Override
  public float price() {
      return isDiet ? 32.0f : 30.0f;
  }
  @Override
  protected String getBaseName() {
      return "Coke";
  }
}