package IteratorPattern.ProductIterator;

public interface Iterator<T> {
    boolean hasNext();
    T currect();
    void next();
}
