public class Main {
    public static void main(String[] args) {
        Television tv = new Television();
        RemoteControl remote = new RemoteControl(6);

        remote.setCommand(0, new TurnOnCommand(tv));
        remote.setCommand(1, new TurnOffCommand(tv));
        remote.setCommand(2, new VolumeUpCommand(tv));
        remote.setCommand(3, new VolumeDownCommand(tv));
        remote.setCommand(4, new NextChannelCommand(tv));
        remote.setCommand(5, new PreviousChannelCommand(tv));

        remote.pressButton(0); // Включить телевизор
        remote.pressButton(2); // Прибавить громкость
        remote.pressButton(4); // Сменить канал на следующий
        remote.pressButton(1); // Выключить телевизор
    }
}
