package Reservations;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Reservation implements Reservationy {

    private String dayOfWeek;
    private String reservationNumber;

    public Reservation() {
        this.dayOfWeek = getDowBooking();
        this.reservationNumber = getCodeBooking();
    }

    @Override
    public String getDowBooking() {
        String[] daysOfWeek = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        String dayOfWeek = daysOfWeek[generateRandomNumber(0,6)];
        return dayOfWeek;
    }

    private int generateRandomNumber(int limitStart, int limitEnd) {
        Random random = new Random();
        int number = random.nextInt(limitEnd) + limitStart;
        return number;
    }

    @Override
    public String getCodeBooking() {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWQYZ0123456789";
        String reservationCode = "";
        for (int i = 0; i < 8; i++) {
            int index = generateRandomNumber(0, 36);
            Character element = letters.charAt(index);
            reservationCode += element;
        }
        return reservationCode;
    }

    public void getReservation() {
        System.out.println("Booking# " + this.reservationNumber + " for " + this.dayOfWeek);
    }
}
