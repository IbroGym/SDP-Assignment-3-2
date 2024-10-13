class PreviousChannelCommand implements Command {
    private Television tv;

    public PreviousChannelCommand(Television tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.previousChannel();
    }
}
