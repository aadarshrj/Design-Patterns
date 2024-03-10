package commandPattern2.Editor;

import java.util.Stack;

public class History {
    private Stack<UndoableCommand> stack = new Stack<>();
    public void push(UndoableCommand command){
        stack.push(command);
    }
    public UndoableCommand pop(){
       return stack.pop();
    }
}
