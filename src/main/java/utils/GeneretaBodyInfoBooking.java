package utils;

import com.google.gson.Gson;
import model.BookingDates;
import model.InfoBooking;

import java.util.List;
import java.util.Map;

public class GeneretaBodyInfoBooking {


    public static String whit(List<Map<String, String>> info) {
        InfoBooking booking = new InfoBooking();
        BookingDates bookingDates = new BookingDates();
        for (Map<String, String> map : info) {

            bookingDates.setCheckin(map.get("checkin"));
            bookingDates.setCheckout(map.get("checkout"));
            booking.setFirstname(map.get("firstname"));
            booking.setLastname(map.get("lastname"));
            booking.setTotalprice(Integer.parseInt(map.get("totalprice")));
            booking.setAdditionalneeds(map.get("additionalneeds"));
            booking.setDepositpaid(Boolean.parseBoolean(map.get("depositpaid")));
            booking.setBookingdates(bookingDates);

        }

        Gson gson = new Gson();
        String json = gson.toJson(booking);

        return json;
    }

}
