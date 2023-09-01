package com.katrinporkul.cinema.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "seats")
@Getter
@Setter
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seatId;

    private Integer seatNumber;

    private Boolean isAvailable;

    @ManyToOne
    @JoinColumn(name = "hall_id")
    private Hall hall;
}