public class FrontDesk {
    private final Valet valet;
    private final HouseKeeping houseKeeping;
    private final Cart cart;

    public FrontDesk() {
        this.valet = new Valet();
        this.houseKeeping = new HouseKeeping();
        this.cart = new Cart();
    }

    public void requestValetPickup(String plateNumber) {
        valet.pickUpVehicle(plateNumber);
    }

    public void requestRoomCleaning(String roomNumber) {
        houseKeeping.cleanRoom(roomNumber);
    }

    public void requestLuggageCarts(int count) {
        if (count <= 0) {
            System.out.println("FrontDesk: Please request at least one cart.");
            return;
        }
        cart.requestCart(count);
    }
}