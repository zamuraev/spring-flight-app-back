package com.zamuraev.repository;

import com.zamuraev.dto.SyntheseCompanyDto;
import com.zamuraev.models.Flight;
import com.zamuraev.models.FlightCriteria;
import com.zamuraev.models.SynthesisCriteria;
import java.util.List;

public interface FlightRepositoryCustom {

    List<Flight> searchFlight(FlightCriteria flightCriteria);
    Long getNumberFlights(SynthesisCriteria synthesisCriteria);
    List<SyntheseCompanyDto> getNbsFlightsByCompany(SynthesisCriteria synthesisCriteria);
}
