package com.zamuraev.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Bookmark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBookmark;
    @Column(name="title")
    private String title;
    @Column(name="adding_date")
    private LocalDate addingDate;
    @Column(name="nb_flights")
    private int nbFlights;
    @Embedded
    private FlightCriteria flightCriteria;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @PrePersist
    public void prePersist() {
        this.addingDate = LocalDate.now();
    }

}
