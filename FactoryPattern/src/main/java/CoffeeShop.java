public abstract class CoffeeShop {

    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = createCoffee(type);
        coffee.grindCoffee();
        coffee.pourIntoCoup();

        System.out.println("Вот ваш кофе! Спасибо, приходите еще!");
        return coffee;
    }

   protected abstract Coffee createCoffee(CoffeeType type);
}
