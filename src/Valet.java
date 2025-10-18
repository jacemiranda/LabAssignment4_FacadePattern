public class Valet implements HotelService {
    public void pickUpVehicle(String plateNumber) {
        System.out.println("Valet: Vehicle with plate " + plateNumber + " is ready at the entrance.");
    }

    @Override
    public void performService() {
    }
}