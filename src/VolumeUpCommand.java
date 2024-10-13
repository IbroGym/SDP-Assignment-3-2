class VolumeUpCommand implements Command {
    private Television tv;

    public VolumeUpCommand(Television tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.volumeUp();
    }
}
