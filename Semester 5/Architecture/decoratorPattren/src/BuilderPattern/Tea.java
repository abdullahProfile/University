package BuilderPattern;
public class Tea implements Item {
  private Packing packing = new Cup();
  private SweetnessType sweetnessType = SweetnessType.REGULAR;
  private int sugarSpoons = 0;
  private boolean hasCream = false;
  private float basePrice = 20.0f;

  @Override
  public String name() {
      String name = "Tea";
      if (sugarSpoons > 0) {
          name += " with " + sweetnessType + " sweetness (" + sugarSpoons + " spoons)";
      }
      if (hasCream) {
          name += " with cream";
      }
      return name;
  }

  @Override
  public Packing packing() {
      return packing;
  }

  @Override
  public float price() {
      float price = basePrice;
      if (hasCream) price += 5.0f;
      price += sugarSpoons * 0.5f;
      return price;
  }

  public Tea withSweetness(SweetnessType type, int spoons) {
      this.sweetnessType = type;
      this.sugarSpoons = spoons;
      return this;
  }

  public Tea withCream() {
      this.hasCream = true;
      return this;
  }

  public enum SweetnessType {
      REGULAR, BROWN_SUGAR, ARTIFICIAL
  }
}