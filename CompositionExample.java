class Room{
    private String roomType;
    Room(String roomType){
        this.roomType = roomType;
    }
    void displayRoom(){
        System.out.println("Room Type: "+roomType);
    }
}
class House{
    private String houseName;
    private Room room;
    House(String houseName,String roomType){
        this.houseName = houseName;
        room = new Room(roomType);

    }
    void displayHouse(){
        System.out.println("House Name: "+ houseName);
        room.displayRoom();
    }
}
public class CompositionExample {
 public static void main(String[] args) {
    House house = new House("Green Villa","Bedroom" );
    house.displayHouse();
 }
    
}
