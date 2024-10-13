class NextChannelCommand implements Command {
    private Television tv;

    public NextChannelCommand(Television tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.nextChannel();
    }
}
