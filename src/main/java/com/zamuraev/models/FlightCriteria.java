package com.zamuraev.models;

import com.zamuraev.enumerations.FlightType;
import com.zamuraev.enumerations.TravelType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Embeddable;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class FlightCriteria {

    private Company company;
    private FlightType flightType;
    private TravelType travelType;
    private String departureLocation;
    private String arrivalLocation;
    private Double fareMin;
    private Double fareMax;
    private LocalTime flightDurationMin;
    private LocalTime flightDurationMax;
    private String aircraftType;
    private LocalDate departureDateMin;
    private LocalDate arrivalDateMin;
    private LocalDate backDateMin;
    private LocalTime departureTimeMin;
    private LocalDate arrivalTimeMin;
    private LocalTime backTimeMin;
    private LocalDate departureDateMax;
    private LocalDate arrivalDateMax;
    private LocalDate backDateMax;
    private LocalTime departureTimeMax;
    private LocalTime arrivalTimeMax;
    private LocalTime backTimeMax;
    private LocalTime connectionDurationMin;
    private LocalTime connectionDurationMax;


}
