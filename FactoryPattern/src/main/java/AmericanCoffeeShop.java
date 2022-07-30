public class AmericanCoffeeShop extends CoffeeShop{
    @Override
    protected Coffee createCoffee(CoffeeType type) {
        Coffee coffee = null;
        switch (type) {
            case AMERICANO:
                coffee = new AmericanoStyleAmericano();
                break;
            case ESPRESSO:
                coffee = new AmericanoStyleEspresso();
                break;
            case CAPPUCCINO:
                coffee = new AmericanoStyleCappuccino();
                break;
            case CAFFE_LATTE:
                coffee = new AmericanStyleCaffeLatte();
                break;
        }
        return coffee;
    }
    }
