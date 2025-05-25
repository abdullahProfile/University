package BuilderPattern;
public class MealBuilder {
  public Meal prepareVegMeal(boolean dietDrink) {
      Meal meal = new Meal();
      meal.addItem(new VegBurger());
      Coke coke = new Coke();
      if (dietDrink) coke.setDiet(true);
      meal.addItem(coke);
      return meal;
  }

  public Meal prepareNonVegMeal(boolean dietDrink) {
      Meal meal = new Meal();
      meal.addItem(new ChickenBurger());
      Pepsi pepsi = new Pepsi();
      if (dietDrink) pepsi.setDiet(true);
      meal.addItem(pepsi);
      return meal;
  }

  public Meal prepareTeaMeal(Tea.SweetnessType sweetness, int spoons, boolean withCream) {
      Meal meal = new Meal();
      meal.addItem(new VegBurger());
      Tea tea = new Tea().withSweetness(sweetness, spoons);
      if (withCream) tea.withCream();
      meal.addItem(tea);
      return meal;
  }
}