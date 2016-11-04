package builder.realization0_classic;

/**
 * Created by ruslan.
 */
public abstract class Builder {

    protected Product product;

    public void buildPart1() {
        product = new Product();
    }

    public Product getResult() {
        return product;
    }

    protected abstract void buildPart2();
    protected abstract void buildPart3();
    protected abstract void buildPart4();
}
