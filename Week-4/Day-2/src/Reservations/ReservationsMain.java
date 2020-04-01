package Reservations;

public class ReservationsMain {
    public static void main(String[] args) {
        System.out.println();
        Booking booking = new Booking();
        for (int i = 0; i < 10; i++) {
            booking.getBooking();
        }
    }
}