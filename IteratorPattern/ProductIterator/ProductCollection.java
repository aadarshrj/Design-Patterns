package IteratorPattern.ProductIterator;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    private class ProductIterator implements Iterator<Product> {
        private ProductCollection pc;
        private int index;

        public ProductIterator(ProductCollection pc) {
            this.pc = pc;
        }

        @Override
        public boolean hasNext() {
            return index < pc.products.size();
        }

        @Override
        public Product currect() {
            return pc.products.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
