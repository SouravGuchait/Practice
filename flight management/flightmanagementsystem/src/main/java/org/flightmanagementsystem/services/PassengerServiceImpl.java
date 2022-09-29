package org.flightmanagementsystem.services;

import java.math.BigInteger;
import java.util.List;

import org.flightmanagementsystem.dao.PassengerDao;
import org.flightmanagementsystem.exception.ResourceNotFoundException;
import org.flightmanagementsystem.model.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassengerServiceImpl implements PassengerService {
	//dependency injection
	@Autowired
	private  PassengerDao passengerDao;
	//constructor injection
	public PassengerServiceImpl(PassengerDao passengerDao) {
		super();
		this.passengerDao = passengerDao;
	}

	@Override
	public Passenger savePassenger(Passenger passenger) {
		return passengerDao.save(passenger);
	}

	@Override
	public List<Passenger> getAllPassenger() {
		return passengerDao.findAll();
	}

	@Override
	public Passenger getPassengerById(BigInteger pnrNumber) {
		return passengerDao.findById(pnrNumber).orElseThrow(()->
		new ResourceNotFoundException("Passenger","PnrNumber",pnrNumber));
	}

	@Override
	public Passenger updatePassenger(Passenger passenger, BigInteger pnrNumber) {
		Passenger full=passengerDao.findById(pnrNumber).orElseThrow(()->
		new ResourceNotFoundException("Passenger","PnrNumber",pnrNumber));
		
		full.setPassengerName(passenger.getPassengerName());
		full.setPassengerUIN(passenger.getPassengerUIN());
		full.setPassengerAge(passenger.getPassengerAge());
		full.setLuggage(passenger.getLuggage());
		return full ;
	}

	@Override
	public void deletePassenger(BigInteger pnrNumber) {
		passengerDao.findById(pnrNumber).orElseThrow(()->
		new ResourceNotFoundException("Passenger","PnrNumber",pnrNumber));     
	    passengerDao.deleteById(pnrNumber);
		
	}
	
}