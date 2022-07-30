public class SimpleItallianoCoffeeFactory extends SimpleCoffeeFactory{
    @Override
    public Coffee createCoffee(CoffeeType type) {
        Coffee coffee = null;

        switch (type) {
            case AMERICANO:
                coffee =  new ItallianoStyleAmericano();
                coffee.setStyle(" ---Italian style---");
                break;
            case ESPRESSO:
                coffee = new ItallianoStyleEspresso();
                coffee.setStyle(" ---Italian style---");
                break;
            case CAPPUCCINO:
                coffee = new ItallianoStyleCappuccino();
                coffee.setStyle(" ---Italian style---");
                break;
            case CAFFE_LATE:
                coffee = new ItallianoStyleCaffeLAtte();
                coffee.setStyle(" ---Italian style---");
                break;
        }

        return coffee;
    }
}

