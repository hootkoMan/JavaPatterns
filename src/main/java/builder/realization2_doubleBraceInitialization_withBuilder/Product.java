package builder.realization2_doubleBraceInitialization_withBuilder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * Created by ruslan.
 */
@Getter
@AllArgsConstructor
@ToString
public final class Product {

    private final String string1;
    private final String string2;
    private final String string3;

    //nested inner class
    public static class Builder {
        protected String string1 = "default1";
        protected String string2 = "default2";
        protected String string3 = "default3";

        public Product build() {
            return new Product(string1, string2, string3);
        }
    }
}
