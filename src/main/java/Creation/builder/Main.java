package Creation.builder;

public class Main {
    public static void main(String[] args) {
        Pizza regularPanMargherita = new MargheritaPizzaBuilder()
                .withCrust(Crust.PAN)
                .ofSize(Size.REGULAR)
                .withSauce(Sauce.TOMATO)
                .build();
        Pizza peperoniLarge = new PepperoniPizzaBuilder().build();
        Pizza pineapplePizza = new PineapplePizzaBuilder().withSauce(Sauce.PESTO).build();
        System.out.println(regularPanMargherita);
        System.out.println(peperoniLarge);
        System.out.println(pineapplePizza);

    }
}

