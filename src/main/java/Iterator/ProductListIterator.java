package Iterator;

import java.util.List;

public class ProductListIterator implements Iterator<Product>{

    private List<Product> products;
    private int position;

    public ProductListIterator(List<Product> products) {
        this.products = products;
        this.position = 0;
    }

    @Override
    public Product getNext() {
        return products.get(position++);
    }

    @Override
    public boolean hasNext() {
        if (position >= products.size()) return false;
        return true;
    }
}
