package com.project.BookMyShow.model;

import com.project.BookMyShow.model.constant.AuditoriumFeature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "Auditorium_Table")
public class Auditorium extends BaseModel{
private String name;
private int capacity;
@OneToMany
private List<Show> shows;
@OneToMany
private List<Seat> seats;
@ElementCollection
@Enumerated(EnumType.STRING)
private List<AuditoriumFeature> auditoriumFeatures;

}
