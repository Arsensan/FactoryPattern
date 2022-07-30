public class Coffee {
    String style;

    public void grindCoffee(CoffeeType type) {
        System.out.println("Мелим кофе " + type.name() + style);
    }


    public void makeCoffee(CoffeeType type) {
        System.out.println("Мелим кофе " + type.name() + style);

    }

    public void pourIntoCoup(CoffeeType type) {
        System.out.println("Мелим кофе " + type.name() + style);

    }


    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
