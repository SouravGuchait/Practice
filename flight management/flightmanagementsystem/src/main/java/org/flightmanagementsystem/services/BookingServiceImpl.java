package org.flightmanagementsystem.services;


import java.util.List;

import org.flightmanagementsystem.dao.BookingDao;
import org.flightmanagementsystem.exception.DataNotFoundException;
import org.flightmanagementsystem.model.Booking;
import org.springframework.stereotype.Service;


@Service
public class BookingServiceImpl implements BookingService{
	//DI
	private BookingDao bookingDao;

	public BookingServiceImpl(BookingDao bookingDao) {
		super();
		this.bookingDao = bookingDao;
	}
	
	//Create:
	@Override
	public Booking saveBooking(Booking booking) {
		return bookingDao.save(booking);
	}
	//Get by ID:
	@Override
	public Booking getBookingById(long bookingid) {
		return bookingDao.findById(bookingid).orElseThrow( ()->
		new DataNotFoundException("Booking" , "BookingId", bookingid));
	}
	//Display all:
	@Override
	public List<Booking> displayAllBooking() {	
		return bookingDao.findAll() ;
	}

	//Update:
	@Override
	public Booking updatebooking(Booking booking, long bookingid) {
		Booking exsitingBooking = bookingDao.findById(bookingid).orElseThrow( ()->
		new DataNotFoundException("Booking", "BookingId", bookingid));
		exsitingBooking.setBookingdate(booking.getBookingdate());
		exsitingBooking.setTicketCost(booking.getTicketCost());
		exsitingBooking.setNoOfPassenger(booking.getNoOfPassenger());
		bookingDao.save(exsitingBooking);
		return exsitingBooking;
	}

	//Delete:
	@Override
	public void deleteBooking(long bookingid) {
		bookingDao.findById(bookingid).orElseThrow( ()->
		new DataNotFoundException("Booking", "BookingId", bookingid));
		bookingDao.deleteById(bookingid);
		
	}
}

