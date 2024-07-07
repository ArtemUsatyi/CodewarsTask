package patterns.facade;

public class RoomFacade {
    TV tv = new TV();
    Radio radio = new Radio();
    Light light = new Light();

    public void pressButton(String channel, String station) {
        tv.playChannel(channel);
        radio.playChannelStation(station);
        light.turnLight();
    }
}
