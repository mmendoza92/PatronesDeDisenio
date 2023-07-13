package Iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductList {

    private List<Product> products;

    public ProductList() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    public ProductListIterator iterator(){
        return new ProductListIterator(products);
    }
}
