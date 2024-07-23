package com.project.BookMyShow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity(name = "Actor_Table")
public class Actor extends BaseModel{
    private int id;
    private String name;
    @ManyToMany
    private List<Movie> movies;
}
