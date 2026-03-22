package co.boerg.prototype.product;

import java.util.HashMap;

public class PrototypeManager {
    HashMap<VALID_PRODUCTS, ProductPrototype> prototypeHashMap = new HashMap<>();
    Model_Product modelProduct = new Model_Product();
    public PrototypeManager(){
        prototypeHashMap.put(VALID_PRODUCTS.BUCH, new Buch());
        prototypeHashMap.put(VALID_PRODUCTS.CD, new CD());
        prototypeHashMap.put(VALID_PRODUCTS.DVD, new DvD());
    }

    public ProductPrototype getPrototype(VALID_PRODUCTS product){
        return prototypeHashMap.get(product).clone();
    }
    public Model_Product getModelProduct(){
        return modelProduct.clone();
    }
}
