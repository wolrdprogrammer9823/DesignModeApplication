package com.wolfsea.designmodeapplication.designmode.factorymethod5;
import java.util.HashMap;
import java.util.Map;

public class ProductFactory {

    private static final String TYPE_1 = "type1";
    private static final String TYPE_2 = "type2";

    private static Map<String, IProduct> container = new HashMap<>();

    public static synchronized IProduct createProduct(String type) {

        IProduct product = null;

        if (container.containsKey(type)) {

            product = container.get(type);
        } else {
            if (type.equals(TYPE_1)) {

                product = new ConcreteProduct1();
            } else if (type.equals(TYPE_2)) {

                product = new ConcreteProduct2();
            }

            container.put(type, product);
        }

        return product;
    }
}
