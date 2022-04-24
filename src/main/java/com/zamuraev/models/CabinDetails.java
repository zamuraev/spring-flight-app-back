package com.zamuraev.models;

import com.zamuraev.enumerations.CabinClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CabinDetails {

    @Enumerated(EnumType.STRING)
    private CabinClass cabinClass;
    private String bagage;
    private String cancellation;
    private String rebooking;
    private String refund;
    private Double fare;
}
