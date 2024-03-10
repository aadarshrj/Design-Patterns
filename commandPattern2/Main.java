package commandPattern2;

import commandPattern2.framework.Button;
import commandPattern2.framework.Command;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*CustomerService service = new CustomerService();
        Command command = new AddCustomerCommand(service);
        Button button = new Button(command);

        button.click();*/

        CompositeCommand compositeCommand = new CompositeCommand();
        compositeCommand.add(new BlackAndWhiteCommand());
        compositeCommand.add(new ResizeCommand());

        compositeCommand.execute();
        List<Integer> list = new ArrayList<>();

    }

}
