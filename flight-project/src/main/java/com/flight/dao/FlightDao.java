package com.flight.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.dto.Flight;

public interface FlightDao extends JpaRepository<Flight, Long>{

}
