package Reservations;

import java.util.Random;

public class Booking implements Reservations {

   public Booking (){}

   public void getBooking(){
       System.out.println("Booking# " + getCodeBooking() + " for " + getDowBooking());
   }

    @Override
    public String getDowBooking() {
        String[] weekdayArray = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        int i = new Random().nextInt(7 + 0); // Random Number between 0 (excluded min) & 7 (included max)
        String weekday = weekdayArray[i];
        //Control: System.out.println(weekday);
        return weekday;
    }

    @Override
    public String getCodeBooking() {
        StringBuilder bookingReference = new StringBuilder();
        String charSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        Random random = new Random();
        while (bookingReference.length() < 8){
            int index = (int) (random.nextFloat() * charSet.length());
            bookingReference.append(charSet.charAt(index));
        }
        return (bookingReference.toString());
    }
}
