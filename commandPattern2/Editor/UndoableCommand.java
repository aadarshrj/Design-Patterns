package commandPattern2.Editor;

public interface UndoableCommand extends Command{
    void unexecute();
}
