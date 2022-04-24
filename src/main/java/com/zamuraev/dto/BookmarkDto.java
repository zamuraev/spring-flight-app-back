package com.zamuraev.dto;

import com.zamuraev.models.FlightCriteria;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookmarkDto {

    private String title;
    private int nbFlights;
    private FlightCriteria flightCriteria;

}
