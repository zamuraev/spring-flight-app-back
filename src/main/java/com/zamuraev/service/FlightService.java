package com.zamuraev.service;

import com.zamuraev.dto.SyntheseCompanyDto;
import com.zamuraev.models.Flight;
import com.zamuraev.models.FlightCriteria;
import com.zamuraev.models.SynthesisCriteria;
import java.util.List;

public interface FlightService {

    Flight addFlight(Flight flight);
    List<Flight> getAllFlights();
    List<Flight> searchFlight(FlightCriteria flightCriteria);
    Flight getFlight(Long idFlight);
    Long getNumberFlights(SynthesisCriteria synthesisCriteria);
    List<SyntheseCompanyDto> getNbsFlightsByCompany(SynthesisCriteria synthesisCriteria);
}
