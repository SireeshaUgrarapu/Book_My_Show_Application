package com.project.BookMyShow.repository;

import com.project.BookMyShow.model.Auditorium;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditoriumRepository extends JpaRepository<Auditorium, Integer> {
    Auditorium findAuditoriumByName(String name);
}
