package com.zamuraev.dto;

import com.zamuraev.enumerations.CompanyName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SyntheseCompanyDto {

     private CompanyName companyName;
     private Long nbFlights;

}
