class RemoteControl {
    private Command[] commands;

    public RemoteControl(int numOfButtons) {
        commands = new Command[numOfButtons];
    }

    public void setCommand(int button, Command command) {
        commands[button] = command;
    }

    public void pressButton(int button) {
        if (commands[button] != null) {
            commands[button].execute();
        } else {
            System.out.println("No command assigned to this button");
        }
    }
}
