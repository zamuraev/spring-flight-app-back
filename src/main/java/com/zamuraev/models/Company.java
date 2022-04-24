package com.zamuraev.models;

import com.zamuraev.enumerations.CompanyName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCompany;

    @Column(name = "company_name")
    @Enumerated(EnumType.STRING)
    private CompanyName companyName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "company")
    private Set<Flight> flights;

    @ElementCollection
    @CollectionTable(name="cabin_details", joinColumns = @JoinColumn(name="company_id"))
    private Set<CabinDetails> cabinDetails;

    @ElementCollection
    @CollectionTable(name="inflight_infos", joinColumns = @JoinColumn(name = "company_id"))
    private Set<InflightInfo> inflightInfos;
}
