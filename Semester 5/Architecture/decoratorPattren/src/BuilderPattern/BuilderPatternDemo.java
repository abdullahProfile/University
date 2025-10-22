package BuilderPattern;
import java.util.Scanner;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Fast Food Restaurant!");
        System.out.println("Choose meal type:");
        System.out.println("1. Vegetarian Meal");
        System.out.println("2. Non-Vegetarian Meal");
        System.out.println("3. Tea Combo Meal");
        System.out.print("Enter your choice (1-3): ");

        int choice = scanner.nextInt();
        Meal meal;

        switch (choice) {
            case 1:
                System.out.print("Would you like diet Coke? (y/n): ");
                boolean diet = scanner.next().equalsIgnoreCase("y");
                meal = mealBuilder.prepareVegMeal(diet);
                break;
            case 2:
                System.out.print("Would you like diet Pepsi? (y/n): ");
                diet = scanner.next().equalsIgnoreCase("y");
                meal = mealBuilder.prepareNonVegMeal(diet);
                break;
            case 3:
                System.out.println("Choose tea sweetness:");
                System.out.println("1. Regular Sugar");
                System.out.println("2. Brown Sugar");
                System.out.println("3. Artificial Sweetener");
                System.out.print("Enter choice (1-3): ");
                int sweetChoice = scanner.nextInt();

                Tea.SweetnessType sweetness = Tea.SweetnessType.REGULAR;
                switch (sweetChoice) {
                    case 1: sweetness = Tea.SweetnessType.REGULAR; break;
                    case 2: sweetness = Tea.SweetnessType.BROWN_SUGAR; break;
                    case 3: sweetness = Tea.SweetnessType.ARTIFICIAL; break;
                }

                System.out.print("Enter number of sugar spoons: ");
                int spoons = scanner.nextInt();

                System.out.print("Add cream? (y/n): ");
                boolean cream = scanner.next().equalsIgnoreCase("y");

                meal = mealBuilder.prepareTeaMeal(sweetness, spoons, cream);
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.println("\nYour Meal:");
        meal.showItems();
        System.out.println("Total Cost: " + meal.getCost());
    }
}
