package BuilderPattern;


public abstract class ColdDrink implements Item {
  protected boolean isDiet = false;  // Changed to protected for subclass access

  public ColdDrink setDiet(boolean isDiet) {
      this.isDiet = isDiet;
      return this;
  }

  @Override
  public Packing packing() {
      return new Bottle();
  }

  @Override
  public String name() {
      return isDiet ? "Diet " + getBaseName() : getBaseName();
  }

  protected abstract String getBaseName();

  @Override
  public abstract float price();
}
