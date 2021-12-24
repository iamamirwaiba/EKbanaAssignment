import java.util.Scanner;

public class PizzaBuildFactory {
    public Pizza getPizza() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your Pizza");
        System.out.println("1.Veg Pizza");
        System.out.println("2.Chicken Pizza");
        System.out.println("3.Papperoni Pizza");
        System.out.println("4.Exit");
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                System.out.println("Which size pizza you want");
                System.out.println("1.Small");
                System.out.println("2.Medium");
                System.out.println("3.Large");
                int j = scanner.nextInt();
                switch (j) {
                    case 1:
                        return new SmallVegPizza();
                    case 2:
                        return new MediumVegPizza();
                    case 3:
                        return new LargeVegPizza();
                    default:
                        break;
                }
            case 2:
                System.out.println("Which size pizza you want");
                System.out.println("1.Small");
                System.out.println("2.Medium");
                System.out.println("3.Large");
                int k = scanner.nextInt();
                switch (k) {
                    case 1:
                        return new SmallChickenPizza();

                    case 2:
                        return new MediumChickenPizza();

                    case 3:
                        return new LargeChickenPizza();

                    default:
                        break;

                }
            case 3:
                System.out.println("Which size pizza you want");
                System.out.println("1.Small");
                System.out.println("2.Medium");
                System.out.println("3.Large");
                int l = scanner.nextInt();
                switch (l) {
                    case 1:
                        return new SmallPapperoniPizza();

                    case 2:
                        return new MediumPapperoniPizza();

                    case 3:
                        return new LargePapperoniPizza();

                    default:
                        break;

                }

            default:
                break;


        }
        return null;
    }
}
