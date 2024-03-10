package commandPattern2;

import commandPattern2.framework.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize command::");
    }
}
