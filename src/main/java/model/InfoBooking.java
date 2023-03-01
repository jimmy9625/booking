package model;

public class InfoBooking {

    private String firstname;
    private String lastname;
    private int totalprice;
    private Boolean depositpaid;
    private BookingDates bookingdates;
    private String additionalneeds;


    public InfoBooking() {
    }

    public InfoBooking(String firstname, String lastname, int totalprice, BookingDates bookingdates, String additionalneeds, Boolean depositpaid) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.totalprice = totalprice;
        this.bookingdates = bookingdates;
        this.additionalneeds = additionalneeds;
        this.depositpaid = depositpaid;
    }

    public Boolean getDepositpaid() {
        return depositpaid;
    }

    public void setDepositpaid(Boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }


    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }

    public BookingDates getBookingdates() {
        return bookingdates;
    }

    public void setBookingdates(BookingDates bookingdates) {
        this.bookingdates = bookingdates;
    }

    @Override
    public String toString() {
        return "{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", totalprice=" + totalprice +
                ", bookingDates=" + bookingdates +
                ", additionalneeds='" + additionalneeds + '\'' +
                ", depositpaid=" + depositpaid +
                '}';
    }
}
