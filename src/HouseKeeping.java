public class HouseKeeping implements HotelService {
    public void cleanRoom(String roomNumber) {
        System.out.println("HouseKeeping: Room " + roomNumber + " has been cleaned.");
    }

    @Override
    public void performService() { }
}