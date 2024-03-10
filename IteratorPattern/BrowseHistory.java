package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private List<String> urls = new ArrayList<>();

    public void push(String url){
        urls.add(url);
    }
    public String pop(){
        String ele = urls.get(urls.size() - 1);
        urls.remove(urls.size() - 1);
        return ele;
    }
    public Iterator getIterator(){
        return new ListIterator(this);
    }
    public class ListIterator implements Iterator {
        private BrowseHistory history;
        private int index;

        public ListIterator(BrowseHistory browseHistory){
            this.history = browseHistory;
        }

        @Override
        public boolean hasNext() {
            return (index < history.urls.size());
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
