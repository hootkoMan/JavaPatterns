package builder.realization0_classic;

/**
 * Created by ruslan.
 */
public class Main{
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Foreman foreman = new Foreman(builder);

        foreman.construct();

        Product product = foreman.getProduct();

        System.out.println(product);

        secondBuild();
    }

    private static void secondBuild() {
        Builder builder = new ConcreteBuilder();
        Foreman foreman = new Foreman(builder);

        foreman.construct1();

        Product product = foreman.getProduct();

        System.out.println(product);
    }
}
