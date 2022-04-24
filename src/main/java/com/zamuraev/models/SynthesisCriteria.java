package com.zamuraev.models;

import lombok.Data;
import java.time.LocalDate;

@Data
public class SynthesisCriteria {

    private LocalDate departureDateMin;
    private LocalDate departureDateMax;

}
