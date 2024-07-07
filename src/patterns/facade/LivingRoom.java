package patterns.facade;

public class LivingRoom {

    RoomFacade roomFacade = new RoomFacade();

    public void pressButton(String channel, String station) {
        roomFacade.pressButton(channel, station);
    }
}
