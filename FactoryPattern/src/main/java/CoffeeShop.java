public  class CoffeeShop {
    private final SimpleCoffeeFactory coffeeFactory;

    public CoffeeShop(SimpleCoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = coffeeFactory.createCoffee(type);
        coffee.grindCoffee(type);
        coffee.makeCoffee(type);
        coffee.pourIntoCoup(type);

        System.out.println("Вот ваш кофе! Спасибо, приходите еще!");
        return coffee;
    }
}
