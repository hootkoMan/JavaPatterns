package builder.realization0_classic;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by ruslan.
 */
@Getter
@Setter
@ToString/*(exclude = "string1") // invisible string1 */
public class Product {
    private String string1;
    private String string2;
    private String string3;
}
