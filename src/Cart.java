public class Cart implements HotelService {
    public void requestCart(int numberOfCarts) {
        System.out.println("Cart Service: Dispatched " + numberOfCarts + " luggage cart(s).");
    }

    @Override
    public void performService() { }
}