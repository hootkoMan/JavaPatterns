package builder.realization2_doubleBraceInitialization_withBuilder;

/**
 * Created by ruslan.
 */

//- создаем анонимный унаследованый класс и вмешиваемся в цепочку наследования,
//  а от этого стандартный equals может не работать;
//- возможная утечка памяти, так как анонимный класс будет держать ссылку на контекст создания;
//- инициализация полей без проверок;
//- не поддерживает создание immutable объектов.
public class Main {
    public static void main(String[] args) {
        Product product = new Product.Builder() {{
            string1 = "data 1";
            string2 = "data 2";
            string3 = "data 3";
        }}.build();

        System.out.println(product);
        System.out.println(product.getClass());

    }
}
