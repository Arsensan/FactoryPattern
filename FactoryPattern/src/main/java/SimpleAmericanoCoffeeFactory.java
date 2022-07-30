public class SimpleAmericanoCoffeeFactory extends SimpleCoffeeFactory{
    @Override
    public Coffee createCoffee(CoffeeType type) {
        Coffee coffee = null;

        switch (type) {
            case AMERICANO:
                coffee =  new AmericanoStyleAmericano();
                coffee.setStyle(" ---American Style---");
                break;
            case ESPRESSO:
                coffee = new AmericanoStyleEspresso();
                coffee.setStyle(" ---American Style---");
                break;
            case CAPPUCCINO:
                coffee = new AmericanoStyleCappuccino();
                coffee.setStyle(" ---American Style---");
                break;
            case CAFFE_LATE:
                coffee = new AmericanStyleCaffeLatte();
                coffee.setStyle(" ---American Style---");
                break;
        }

        return coffee;
    }
}
