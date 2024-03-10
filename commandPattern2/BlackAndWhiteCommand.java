package commandPattern2;

import commandPattern2.framework.Command;

public class BlackAndWhiteCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Black and white command::");
    }
}
