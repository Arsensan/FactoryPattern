public class ItalianCoffeeShop extends CoffeeShop {
    @Override
    protected Coffee createCoffee(CoffeeType type) {
        Coffee coffee = null;
        switch (type) {
            case AMERICANO:
                coffee = new ItallianoStyleAmericano();
                break;
            case ESPRESSO:
                coffee = new ItallianoStyleEspresso();
                break;
            case CAPPUCCINO:
                coffee = new ItallianoStyleCappuccino();
                break;
            case CAFFE_LATTE:
                coffee = new ItallianoStyleCaffeLAtte();
                break;
        }
        return coffee;
    }
}

