package com.zamuraev.service.impl;

import com.zamuraev.dto.SyntheseCompanyDto;
import com.zamuraev.models.Flight;
import com.zamuraev.models.FlightCriteria;
import com.zamuraev.models.SynthesisCriteria;
import com.zamuraev.repository.FlightRepository;
import com.zamuraev.service.FlightService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class FlightServiceImpl implements FlightService {

    private final FlightRepository flightRepository;

    @Override
    public Flight addFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    @Override
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    @Override
    public List<Flight> searchFlight(FlightCriteria flightCriteria) {
        return flightRepository.searchFlight(flightCriteria);
    }

    @Override
    public Flight getFlight(Long idFlight) {
        return flightRepository.findById(idFlight).orElse(null);
    }

    @Override
    public Long getNumberFlights(SynthesisCriteria synthesisCriteria) {
        return flightRepository.getNumberFlights(synthesisCriteria);
    }

    @Override
    public List<SyntheseCompanyDto> getNbsFlightsByCompany(SynthesisCriteria synthesisCriteria) {
        return flightRepository.getNbsFlightsByCompany(synthesisCriteria);
    }
}
