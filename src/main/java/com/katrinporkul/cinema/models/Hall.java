package com.katrinporkul.cinema.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "halls")
@Getter
@Setter
public class Hall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hallId;
    private String hallName;

    @OneToMany(mappedBy = "hall")
    private List<Seat> seats;

    @OneToMany(mappedBy = "hall")
    private List<Booking> bookings;
}