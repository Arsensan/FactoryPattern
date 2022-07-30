public class CoffeeApp {
    public static void main(String[] args) {
        SimpleCoffeeFactory simpleItallianoCoffeeFactory = new SimpleItallianoCoffeeFactory();
        SimpleCoffeeFactory simpleAmericanoCoffeeFactory = new SimpleAmericanoCoffeeFactory();
        CoffeeShop itallianoCoffeeShop = new CoffeeShop(simpleItallianoCoffeeFactory);
        CoffeeShop americanoCoffeeShop = new CoffeeShop(simpleAmericanoCoffeeFactory);
        itallianoCoffeeShop.orderCoffee(CoffeeType.CAPPUCCINO);
        System.out.println("************************");
        americanoCoffeeShop.orderCoffee(CoffeeType.CAPPUCCINO);

    }
}
