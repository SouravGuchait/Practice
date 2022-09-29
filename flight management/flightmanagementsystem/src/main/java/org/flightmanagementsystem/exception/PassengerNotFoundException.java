package org.flightmanagementsystem.exception;

import javax.management.RuntimeErrorException;

public class PassengerNotFoundException extends RuntimeErrorException {
	 private static final long serialVersionUID = 1L;
	 private int passengerAge;
		private long passengerUIN;
		private String passengerName;
		private Double Luggage;
		public PassengerNotFoundException(Error e, int passengerAge, long passengerUIN, String passengerName,
				Double luggage) {
			super(e);
			this.passengerAge = passengerAge;
			this.passengerUIN = passengerUIN;
			this.passengerName = passengerName;
			Luggage = luggage;
		}
		public int getPassengerAge() {
			return passengerAge;
		}
		
		public long getPassengerUIN() {
			return passengerUIN;
		}
		
		public String getPassengerName() {
			return passengerName;
		}
		
		public Double getLuggage() {
			return Luggage;
		}
		
		
		public static long getSerialversionuid() {
			return serialVersionUID;
		} 
		
}
