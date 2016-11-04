package builder.realization1_doubleBraceInitialization;

/**
 * Created by ruslan.
 */
public class Main {
    public static void main(String[] args) {
        Product product = new Product(){{
            string1 = " data 1";
            string2 = " data 2";
            string3 = " data 3";
        }};

        System.out.println(product);

        Product product1 = new Product();
        System.out.println(product.getClass());
        System.out.println(product1.getClass());
    }
}
