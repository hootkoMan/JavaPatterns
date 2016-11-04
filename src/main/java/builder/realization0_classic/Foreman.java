package builder.realization0_classic;

/**
 * Created by ruslan.
 */
public class Foreman {
    private Builder builder;

    public Foreman(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildPart1();
        builder.buildPart2();
        builder.buildPart3();
        builder.buildPart4();
    }

    public void construct1() {
        builder.buildPart1();
        builder.buildPart4();
    }

    public Product getProduct() {
        return builder.getResult();
    }
}
