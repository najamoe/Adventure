public class Adventure {
    private Map map = new Map();
    private player player;
    private Room currentRoom;

    public Adventure(){
    map.createMap();
    player = new player();
    player.setCurrentRoom(map.getStarterRoom());
    }

    public Room getCurrentRoom() {
        return player.getCurrentRoom();
    }

    //Direction
    public boolean go(String direction) {
        return player.move(direction);
    }

    public String toString(){
        return getCurrentRoom().getRoomName() + getCurrentRoom().getRoomDescription();
    }
}

