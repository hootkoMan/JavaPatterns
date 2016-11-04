package builder.realization0_classic;

/**
 * Created by ruslan.
 */
public class ConcreteBuilder extends Builder {

    @Override
    protected void buildPart2() {
        product.setString1("Data 1");
    }

    @Override
    protected void buildPart3() {
        product.setString2("Data 2");
    }

    @Override
    protected void buildPart4() {
        product.setString3("Data 3");
    }
}
