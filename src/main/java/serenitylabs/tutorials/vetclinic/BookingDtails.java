package serenitylabs.tutorials.vetclinic;

import java.util.Date;

public class BookingDtails {
	public BookingDtails(Long bookingID, Date bookingDate) {
		super();
		this.bookingID = bookingID;
		this.bookingDate = bookingDate;
	}
	Long bookingID;
	
	public Long getBookingID() {
		return bookingID;
	}
	public void setBookingID(Long bookingID) {
		this.bookingID = bookingID;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	Date bookingDate;
	

}
