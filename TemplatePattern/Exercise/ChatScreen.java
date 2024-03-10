package TemplatePattern.Exercise;

public class ChatScreen extends Window {
    @Override
    protected void onClosed(){
        System.out.println("Chat is closed now::");
    }

    @Override
    protected void onClosing() {

    }
}
