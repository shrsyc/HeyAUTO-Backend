package com.shrsyc.HeyAUTO.HeyAUTOapp.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.locationtech.jts.geom.Point;

@Entity
@Getter
@Setter
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    User user;

    private Double rating;

    @Column(columnDefinition = "Geometry(Point, 4326)")
    Point currentLocation;
}
