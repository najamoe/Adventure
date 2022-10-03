public class Adventure {
    private Map map;
    private player player;

    public Adventure(){
    map = new Map();
    player = new player();
    player.setCurrentRoom(map.getStarterRoom());
    }

    public player getPlayer(){
        return player;
    }

    public Room getCurrentRoom() {
        return player.getCurrentRoom();
    }
    public boolean goNorth(){
        return player.goNorth();
    }
    public boolean goSouth(){
        return player.goSouth();
    }
    public boolean goEast(){
        return player.goEast();
    }
    public boolean goWest(){
        return player.goWest();
    }

}

