package com.zamuraev.dto;

import com.zamuraev.enumerations.CompanyName;
import com.zamuraev.enumerations.FlightType;
import com.zamuraev.enumerations.TravelType;
import com.zamuraev.models.CabinDetails;
import com.zamuraev.models.InflightInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightDto {

    private Long idFlight;
    private CompanyName companyName;
    private FlightType flightType;
    private TravelType travelType;
    private LocalDate departureDate;
    private LocalDate arrivalDate;
    private LocalDate backDate;
    private LocalDate departureTime;
    private LocalDate arrivalTime;
    private LocalDate backTime;
    private String departureLocation;
    private String arrivalLocation;
    private LocalTime flightDuration;
    private LocalTime connectionDuration;
    private String aircraftType;
    private Set<CabinDetails> cabinDetails;
    private Set<String> comforts;
    private Set<InflightInfo> inflightInfos;
}
