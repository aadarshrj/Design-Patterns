package memento.memento2;

import java.util.Stack;

public class DocumentHistory {
    private Stack<DocumentState> states = new Stack<>();

    public void push(DocumentState documentState){
        states.push(documentState);
    }
    public DocumentState pop(){
        return states.pop();
    }
}
